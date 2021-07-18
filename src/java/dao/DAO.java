/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import context.DBContext;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Account;
import model.FeedbackOfAccount;
import model.Product;
import model.ProductDescription;

/**
 *
 * @author admin
 */
public class DAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

//    load toàn bộ xe ra trang chủ
    public List<Product> getALlProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from HE141035_Product";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getDouble(6),
                        rs.getString(7)
                ));
            }

        } catch (Exception e) {
        }
        return list;
    }
//   tìm kiếm sản phẩm theo tùy chỉnh
    public List<Product> searchProduct(String type , String txt,boolean check) {
//        tạo hàm check để xem nó là loại nào neesi string thì là like còn số thì là =
        String query="";
//        1 là tìm theo string
        if(check){
            query= "select p.* from HE141035_Product p inner join HE141035_ProductDescription pd\n" +
                        "on p.ProductID = pd.ProductID where "
                          + type +" like ?";
        }else{
            query= "select p.* from HE141035_Product p inner join HE141035_ProductDescription pd\n" +
                        "on p.ProductID = pd.ProductID where "
                          + type +" ?";
        }
        List<Product> list = new ArrayList<>();

        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
//            chọn thể loại tìm kiếm
            if(check){
                ps.setString(1, '%'+txt+'%');
            }else{
                ps.setInt(1, Integer.parseInt(txt));
            }           
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getDouble(6),
                        rs.getString(7)
                ));
            }

        } catch (Exception e) {
        }
        return list;
    }
    //    sắp xếp sản phẩm theo tìm kiếm
    public List<Product> orderByProduct(String typeProduct,String txt,
            String typeSearch,boolean check) {
        List<Product> list = new ArrayList<>();
        String query = "";
        if(check){
            query= "select p.* from HE141035_Product p inner join HE141035_ProductDescription pd\n" +
                        "on p.ProductID = pd.ProductID where "
                          + typeSearch +" like ? order by "+typeProduct;
        }else{
            query= "select p.* from HE141035_Product p inner join HE141035_ProductDescription pd\n" +
                        "on p.ProductID = pd.ProductID where "
                          + typeSearch +" ? order by "+typeProduct;
        }
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            if (check) {
                ps.setString(1, '%' + txt + '%');
            } else {
                ps.setInt(1, Integer.parseInt(txt));
            }
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getDouble(6),
                        rs.getString(7)
                ));
            }

        } catch (Exception e) {
        }
        return list;
    }
//    sắp xếp tất sản phẩm  
    public List<Product> orderByAllProduct(String typeProduct) {
        List<Product> list = new ArrayList<>();
        String query = "";
        query= "select p.* from HE141035_Product p inner join HE141035_ProductDescription pd\n" +
                        "on p.ProductID = pd.ProductID order by "+typeProduct;
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getDouble(6),
                        rs.getString(7)
                ));
            }

        } catch (Exception e) {
        }
        return list;
    }
//    kiểm tra tk đã tồn tài chưa trước khi đăng ký tài khoản
    public Account checkExist(String user) {
        String query = "select * from HE141035_Account\n"
                + "where [userName] = ?\n";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, user);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            if (rs.next()) {
                return new Account(
//                        theo cột trong sql
                        rs.getString(2),
                        rs.getString(4),
                        rs.getInt(1),   
                        rs.getString(3),   
                        rs.getBoolean(5),
                        rs.getString(6) 
                );
            }
        } catch (Exception e) {
        }
        return null;
    }
//    đăng nhập
    public Account login(String user, String pass) {
        String query = "select * from HE141035_Account\n"
                + "where [userName] = ? and [userPassword] = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                return new Account(
                        rs.getString(2),
                        rs.getString(4),
                        rs.getInt(1),   
                        rs.getString(3),   
                        rs.getBoolean(5),
                        rs.getString(6) 
                );
            }
        } catch (Exception e) {
        }
        return null;
    }
//    đăng ký tài khoản
    public void signUP(String username, String password,int phone,String email,boolean isAd) {
        String query = "INSERT INTO HE141035_Account(phone,userName,email,userPassword,isAdmin,viewSchedule)\n" +
                        "VALUES (?,?,?,?,?,null);";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setInt(1, phone);
            ps.setString(2, username);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setBoolean(5, isAd);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
//    mã hóa mk vào trong database
public String convertPassWord(String text) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashInBytes = md.digest(text.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : hashInBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
        }
        return "";
    }
    public List<Account> getALlAccountBought() {
        List<Account> list = new ArrayList<>();
        String query = "select a.* from HE141035_Account a inner join\n" +
"HE141035_Buy b on a.phone = b.phonee";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(
                        new Account(
                        rs.getString(2),
                        rs.getString(4),
                        rs.getInt(1),   
                        rs.getString(3),   
                        rs.getBoolean(5),      
                        rs.getString(6)    
                ));
            }

        } catch (Exception e) {
        }
        return list;
    }
    public void addNewProduct(String productName, int categoryID,int unitsInStock,
            int unitsOnOrder,float unitsPrice,String img) {
        String query = "INSERT INTO [dbo].[HE141035_Product]\n"
                + "           ([ProductName]\n"
                + "           ,[CategoryID]\n"
                + "           ,[UnitsInStock]\n"
                + "           ,[UnitsOnOrder]\n"
                + "           ,[UnitsPrice]\n"
                + "           ,[img])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, productName);
            ps.setInt(2, categoryID);
            ps.setInt(3, unitsInStock);
            ps.setInt(4, unitsOnOrder);
            ps.setFloat(5, unitsPrice);
            ps.setString(6, img);
            ps.executeUpdate();        
        } catch (Exception e) {
        }
     }
    public void addNewProductDesctiption(int productID, String img1,String img2,String img3,String img4,
            String sale,String giaxesale,String namsanxuat,
            int hopso,int tinhtrang,String xuatxu,String mausac,String nhienlieu,int soghe) {
        String query = "INSERT INTO [dbo].[HE141035_ProductDescription]\n" +
"           ([ProductID]\n" +
"           ,[img1]\n" +
"           ,[img2]\n" +
"           ,[img3]\n" +
"           ,[img4]\n" +
"           ,[sale]\n" +
"           ,[giaxesale]\n" +
"           ,[namsanxuat]\n" +
"           ,[hopso]\n" +
"           ,[tinhtrang]\n" +
"           ,[xuatxu]\n" +
"           ,[mausac]\n" +
"           ,[nhienlieu]\n" +
"           ,[soghe])\n" +
"     VALUES\n" +
"           (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            Date x;
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setInt(1, productID);
            ps.setString(2, img1);
            ps.setString(3, img2);
            ps.setString(4, img3);
            ps.setString(5, img4);
            ps.setString(6, sale);
            ps.setString(7, giaxesale);
            ps.setString(8, namsanxuat);
            ps.setInt(9, hopso);
            ps.setInt(10, tinhtrang);
            ps.setString(11, xuatxu);
            ps.setString(12, mausac);
            ps.setString(13, nhienlieu);
            ps.setInt(14, soghe);
            ps.executeUpdate();        
        } catch (Exception e) {
            System.out.println("false");
        }
        }
    
    public int getIDProduct(String name , String img){
        String queryGetID = "select HE141035_ProductID from Product \n"
                + "where ProductName = ? and\n"
                + "img = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(queryGetID);//nem cau lenh query sang sql
            ps.setString(1, name);
            ps.setString(2, img);
            rs = ps.executeQuery();            
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return  0;
    }
    public void deleteProdcutByProductID(int id){
        String queryGetID = "DELETE FROM [dbo].[HE141035_Product]\n"
                + "      WHERE ProductID = ?\n"
                + "DELETE FROM [dbo].[HE141035_ProductDescription]\n"
                + "      WHERE ProductID = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(queryGetID);//nem cau lenh query sang sql
            ps.setInt(1, id);
            ps.setInt(2, id);
            ps.executeUpdate();       
        } catch (Exception e) {
        }
    }
    
     public void deleteProduct(int id){
        String queryGetID = "DELETE FROM [dbo].[HE141035_Product]\n"
                + "      WHERE ProductID = ?\n"
                + "DELETE FROM [dbo].[HE141035_ProductDescription]\n"
                + "      WHERE ProductID = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(queryGetID);//nem cau lenh query sang sql
            ps.setInt(1, id);
            ps.setInt(2, id);
            ps.executeUpdate();       
        } catch (Exception e) {
        }
    }
//     lay id theo san pham để chueyern sang trang chi tiết sản phẩm
     public ProductDescription getProductDetailById(int id){
        String queryGetID = "select pd.* from HE141035_Product p inner join HE141035_ProductDescription pd\n"
                 + "on p.ProductID = pd.ProductID where p.ProductID = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(queryGetID);//nem cau lenh query sang sql
            ps.setInt(1, id);
            rs = ps.executeQuery(); 
            while (rs.next()) {
                return new ProductDescription(
                        rs.getInt(1), rs.getString(2),rs.getString(3)
                        , rs.getString(4), rs.getString(5), rs.getString(6)
                        , rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10)
                        , rs.getString(11), rs.getString(12), rs.getString(13), rs.getInt(14));
            }
        } catch (Exception e) {
        }
        return null;
    }
     public Product getProductById(int id){
        String queryGetID = "select * from HE141035_Product where ProductID = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(queryGetID);//nem cau lenh query sang sql
            ps.setInt(1, id);
            rs = ps.executeQuery(); 
            while (rs.next()) {
                return new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getDouble(6),
                        rs.getString(7));
            }
        } catch (Exception e) {
        }
        return null;
    }
//     update sản phẩm  
       public void updateProduct(int productID,String productName, int categoryID,int unitsInStock,
            int unitsOnOrder,float unitsPrice,String img) {
        String query = "UPDATE [dbo].[HE141035_Product]\n"
                   + "   SET [ProductName] = ?\n"
                   + "      ,[CategoryID] = ? \n"
                   + "      ,[UnitsInStock] = ?\n"
                   + "      ,[UnitsOnOrder] = ?\n"
                   + "      ,[UnitsPrice] = ?\n"
                   + "      ,[img] = ?\n"
                   + " WHERE ProductID = ? ";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, productName);
            ps.setInt(2, categoryID);
            ps.setInt(3, unitsInStock);
            ps.setInt(4, unitsOnOrder);
            ps.setFloat(5, unitsPrice);
            ps.setString(6, img);
            ps.setInt(7, productID);
            ps.executeUpdate();        
        } catch (Exception e) {
        }
     }
       
    public void updateProductDesctiption(int productID, String img1,String img2,String img3,String img4,
            String sale,String giaxesale,String namsanxuat,
            int hopso,int tinhtrang,String xuatxu,String mausac,String nhienlieu,int soghe) {
        String query = "UPDATE [dbo].[HE141035_ProductDescription]\n"
                + "SET \n"
                + "      [img1] = ?\n"
                + "      ,[img2] = ?\n"
                + "      ,[img3] = ?\n"
                + "      ,[img4] = ?\n"
                + "      ,[sale] = ?\n"
                + "      ,[giaxesale] = ?\n"
                + "      ,[namsanxuat] = ?\n"
                + "      ,[hopso] = ?\n"
                + "      ,[tinhtrang] = ?\n"
                + "      ,[xuatxu] = ?\n"
                + "      ,[mausac] = ?\n"
                + "      ,[nhienlieu] = ?\n"
                + "      ,[soghe] = ?\n"
                + " WHERE [ProductID] = ? ";
        try {
            Date x;
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            
            ps.setString(1, img1);
            ps.setString(2, img2);
            ps.setString(3, img3);
            ps.setString(4, img4);
            ps.setString(5, sale);
            ps.setString(6, giaxesale);
            ps.setString(7, namsanxuat);
            ps.setInt(8, hopso);
            ps.setInt(9, tinhtrang);
            ps.setString(10, xuatxu);
            ps.setString(11, mausac);
            ps.setString(12, nhienlieu);
            ps.setInt(13, soghe);
            ps.setInt(14, productID);
            ps.executeUpdate();        
        } catch (Exception e) {
            System.out.println("false");
        }
        }
    
//    feedback của khách hàng về dịch vụ
    public void feedbackOfAccount(String email,String name,int phone,String title) {
        String query = "INSERT INTO [dbo].[HE141035_FeedBackAccount]\n"
                + "           ([email]\n"
                + "           ,[name]\n"
                + "           ,[phone]\n"
                + "           ,[tile])\n"
                + "     VALUES(?,?,?,?)";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, email);
            ps.setString(2, name);
            ps.setInt(3, phone);
            ps.setString(4, title);
            ps.executeUpdate();        
        } catch (Exception e) {
        }
     }
    //    load toàn bộ xe ra trang chủ
    public List<FeedbackOfAccount> getALlFeedbackOfAccount() {
        List<FeedbackOfAccount> list = new ArrayList<>();
        String query = "SELECT * FROM [dbo].[HE141035_FeedBackAccount]";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new FeedbackOfAccount(
                        rs.getString(1),                       
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4)
                ));
            }

        } catch (Exception e) {
        }
        return list;
    }
    
//   thêm dữ liệu mua hàng
    public void buyACar(String name,int phone,String address,String email,String buyDate) {
        String query = "INSERT INTO [dbo].[HE141035_Buy]\n"
                + "           ([userMail]\n"
                + "           ,[nameReceiver]\n"
                + "           ,[address]\n"
                + "           ,[orderDate]\n"
                + "           ,[note]\n"
                + "           ,[phonee])\n"
                + "     VALUES (?,?,?,?,null,?)";

        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, email);
            ps.setString(2, name);
            ps.setString(3, address);
            ps.setString(4,buyDate);
            ps.setInt(5, phone);
            ps.executeUpdate();        
        } catch (Exception e) {
            System.out.println("false");
        }
     }
    
    public int getIDBuyACar(int phone , String buyDate){
        String queryGetID = "select orderID from HE141035_Buy "
                            + "where phonee = ? and orderDate = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(queryGetID);//nem cau lenh query sang sql
            ps.setInt(1, phone);
            ps.setString(2, buyDate);
            rs = ps.executeQuery();            
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return  0;
    }
//   thêm dữ liệu chi tiết mua hàng
    public void buyACarDetail(int buyID,int productID,int quantity,double amount) {
        String query = "INSERT INTO [dbo].[HE141035_BuyDetails]\n"
                + "           ([orderID]\n"
                + "           ,[productID]\n"
                + "           ,[quantity]\n"
                + "           ,[amount])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";

        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setInt(1, buyID);
            ps.setInt(2, productID);
            ps.setInt(3, quantity);
            ps.setDouble(4, amount);
            ps.executeUpdate();        
        } catch (Exception e) {
            System.out.println("false");
        }
     }
//    chinhtr sửa lại số lượng kho và order
    public void editUnitsStockAndOrder(int pid) {
        String query = "UPDATE [dbo].[HE141035_Product]\n"
                + "   SET \n"
                + "	[UnitsInStock] = 0\n"
                + "      ,[UnitsOnOrder] = 1\n"
                + " WHERE ProductID = ?";

        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setInt(1, pid);
            ps.executeUpdate();        
        } catch (Exception e) {
            System.out.println("false");
        }
     }

//    đặt lịch cho khách hàng
    public void scheduleACarDelivery(int phone,String dateSchedule) {
        String query = "UPDATE [dbo].[HE141035_Account]\n"
                + "   SET [viewSchedule] = ?\n"
                + " WHERE [phone] = ?";

        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, dateSchedule);
            ps.setInt(2, phone);
            ps.executeUpdate();        
        } catch (Exception e) {
            System.out.println("false");
        }
     }
    public static void main(String[] args) {
        DAO p = new DAO();
//        List<Account> list = p.getALlAccountBought();
//        for (Account feedbackOfAccount : list) {
//            System.out.println(feedbackOfAccount);
//        }
        p.scheduleACarDelivery(123456789, "2021-08-08");
    }
}
