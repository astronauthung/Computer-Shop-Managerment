
package LoginUX;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JFrame;


public class MainUX extends javax.swing.JFrame {
     
    int positionX = 0, positionY = 0;
    
    DefaultTableModel model1, model2, model3, model4, model5, model6, model7;

    public MainUX() {
        
        initComponents();
        icon();
        
        tabledt.setVisible(false);
        tablenv1.setVisible(false);
        
        tablenv();
        loaddatanv();
        
        tablekh();
        loaddatakh();       
        
        tablesp();
        loaddatasp();
        
        tabledt();
        loaddatadt();
        
        tablencc();
        loaddatancc();
        
        tableaccql();
        loaddataaql();
        
        tableaccnv();
        loaddataanv();
        
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));
        
        nvtable1.getTableHeader().setFont(new Font ("Montserrat Medium", Font.PLAIN, 18));
        nvtable1.getTableHeader().setBackground(new Color (249,102,94));
        nvtable1.getTableHeader().setForeground(new Color (250,250,250));
        
        khtable1.getTableHeader().setFont(new Font ("Montserrat Medium", Font.PLAIN, 18));    
        khtable1.getTableHeader().setBackground(new Color (249,102,94));
        khtable1.getTableHeader().setForeground(new Color (250,250,250));
        
        sptable1.getTableHeader().setFont(new Font ("Montserrat Medium", Font.PLAIN, 18));    
        sptable1.getTableHeader().setBackground(new Color (249,102,94));
        sptable1.getTableHeader().setForeground(new Color (250,250,250));
        
        dttable.getTableHeader().setFont(new Font ("Montserrat Medium", Font.PLAIN, 18));    
        dttable.getTableHeader().setBackground(new Color (249,102,94));
        dttable.getTableHeader().setForeground(new Color (250,250,250));
        
        ncctable1.getTableHeader().setFont(new Font ("Montserrat Medium", Font.PLAIN, 18));    
        ncctable1.getTableHeader().setBackground(new Color (249,102,94));
        ncctable1.getTableHeader().setForeground(new Color (250,250,250));
        
        tablead5.getTableHeader().setFont(new Font ("Montserrat Medium", Font.PLAIN, 18));    
        tablead5.getTableHeader().setBackground(new Color (249,102,94));
        tablead5.getTableHeader().setForeground(new Color (250,250,250));
        
        tablenv1.getTableHeader().setFont(new Font ("Montserrat Medium", Font.PLAIN, 18));    
        tablenv1.getTableHeader().setBackground(new Color (249,102,94));
        tablenv1.getTableHeader().setForeground(new Color (250,250,250));
                
    }
    private void tablenv () {
        model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(new String [] {"Mã NV","Họ tên","Ngày sinh", "Giới tính", "Chức vụ", "Địa chỉ", "SDT"});
        nvtable1.setModel(model1);       
    }
    private void tablekh () {
        model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(new String [] {"Mã KH", "Họ tên", "Địa chỉ", "SDT"});
        khtable1.setModel(model2);
    }
    private void tablesp () {
        model3 = new DefaultTableModel();
        model3.setColumnIdentifiers(new String [] {"Mã SP", "Tên SP", "Giá", "Số lượng", "Nhà cung cấp", "Xuất xứ"});
        sptable1.setModel(model3);
    }
    private void tabledt () {
        model4 = new DefaultTableModel();
        model4.setColumnIdentifiers(new String [] {"Thời gian", "Tên SP", "Tổng tiền"});
        dttable.setModel(model4);
    }
    private void tablencc () {
        model5 = new DefaultTableModel();
        model5.setColumnIdentifiers(new String [] {"Mã Nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ", "Số điện thoại"});
        ncctable1.setModel(model5);
    }
    private void tableaccql () {
        model6 = new DefaultTableModel();
        model6.setColumnIdentifiers(new String [] {"Tên đăng nhập", "Mật khẩu"});
        tablead5.setModel(model6);
    }
    private void tableaccnv () {
        model7 = new DefaultTableModel();
        model7.setColumnIdentifiers(new String [] {"Tên đăng nhập", "Mật khẩu"});
        tablenv1.setModel(model7);
    }
       
    private void icon () {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("500.png")));
    }
    
    private void loaddatanv () {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()){
            Statement sm = conn.createStatement();       
            ResultSet rsnv = sm.executeQuery("select * from nhanvien");
            
            model1.setRowCount(0);
            while (rsnv.next()) {
               
                Vector row = new Vector ();
                row.add(rsnv.getString(1));
                row.add(rsnv.getString(2));
                row.add(rsnv.getString(3));
                row.add(rsnv.getString(4));
                row.add(rsnv.getString(5));
                row.add(rsnv.getString(6));
                row.add(rsnv.getString(7));
                
                model1.addRow(row);    
            }
            model1.fireTableDataChanged();
                
        }
        catch (Exception e) {
            System.out.println (e);
        }
 
    }
    
    private void loaddatakh () {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()){
            Statement sm = conn.createStatement();           
            ResultSet rskh = sm.executeQuery("select * from khachhang");
            
            model2.setRowCount(0);
            while (rskh.next()) {
               
                Vector row = new Vector ();
                row.add(rskh.getString(1));
                row.add(rskh.getString(2));
                row.add(rskh.getString(3));
                row.add(rskh.getString(4));
               
                model2.addRow(row);    
            }
            model2.fireTableDataChanged();
                
        }
        catch (Exception e) {
            System.out.println (e);
        }
 
    }
    
    private void loaddatasp () {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()){
            Statement sm = conn.createStatement();           
            ResultSet rskh = sm.executeQuery("select * from sanpham");
            
            model3.setRowCount(0);
            while (rskh.next()) {
               
                Vector row = new Vector ();
                row.add(rskh.getString(1));
                row.add(rskh.getString(2));
                row.add(rskh.getString(3));
                row.add(rskh.getString(4));
                row.add(rskh.getString(5));
                row.add(rskh.getString(6));
               
                model3.addRow(row);    
            }
            model3.fireTableDataChanged();
                
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }
    
    private void loaddatancc() {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from nhacungcap");
            
            model5.setRowCount(0);
            while(rs.next()) {
                Vector ncc = new Vector();
                ncc.add(rs.getString(1));
                ncc.add(rs.getString(2));
                ncc.add(rs.getString(3));
                ncc.add(rs.getString(4));
                
                model5.addRow(ncc);
            }
            model5.fireTableDataChanged();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    private void loaddatadt() {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from doanhthu");
            
            model4.setRowCount(0);
            while(rs.next()) {
                Vector ncc = new Vector();
                ncc.add(rs.getString(1));
                ncc.add(rs.getString(2));
                ncc.add(rs.getString(3));
               
                model4.addRow(ncc);
            }
            model4.fireTableDataChanged();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void loaddataaql() {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Login");
            
            model6.setRowCount(0);
            while(rs.next()) {
                Vector ncc = new Vector();
                ncc.add(rs.getString(1));
                ncc.add(rs.getString(2));             
               
                model6.addRow(ncc);
            }
            model6.fireTableDataChanged();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void loaddataanv() {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from AccountNV");
            
            model7.setRowCount(0);
            while(rs.next()) {
                Vector accnv = new Vector();
                accnv.add(rs.getString(1));
                accnv.add(rs.getString(2));
               
                model7.addRow(accnv);
            }
            model7.fireTableDataChanged();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mother = new javax.swing.JPanel();
        userbanner = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        hello = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nhanvien = new javax.swing.JPanel();
        nvpanel = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        khach = new javax.swing.JPanel();
        khpanel = new javax.swing.JPanel();
        kh2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sp = new javax.swing.JPanel();
        sppanel = new javax.swing.JPanel();
        sp3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doanhthu = new javax.swing.JPanel();
        dtpanel = new javax.swing.JPanel();
        hd1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        account = new javax.swing.JPanel();
        accountpanel = new javax.swing.JPanel();
        npp5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        npp = new javax.swing.JPanel();
        npppanel = new javax.swing.JPanel();
        npp1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        loutpanel = new javax.swing.JPanel();
        lout1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        leftbanner = new javax.swing.JPanel();
        bluenv = new javax.swing.JPanel();
        extbtn = new javax.swing.JLabel();
        getmanv = new javax.swing.JLabel();
        getmanv1 = new javax.swing.JTextField();
        getns = new javax.swing.JLabel();
        getns1 = new javax.swing.JTextField();
        getgt = new javax.swing.JLabel();
        getgt1 = new javax.swing.JTextField();
        getcv = new javax.swing.JLabel();
        getcv1 = new javax.swing.JTextField();
        getdc = new javax.swing.JLabel();
        getdc1 = new javax.swing.JTextField();
        getsdt = new javax.swing.JLabel();
        getsdt1 = new javax.swing.JTextField();
        getmanv2 = new javax.swing.JLabel();
        getname = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        deletenv = new javax.swing.JButton();
        updatenv = new javax.swing.JButton();
        searchbarnv = new javax.swing.JPanel();
        clear = new javax.swing.JLabel();
        searchnv = new javax.swing.JTextField();
        iconsearch = new javax.swing.JLabel();
        addnv = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        nvtable = new javax.swing.JScrollPane();
        nvtable1 = new javax.swing.JTable();
        khtable = new javax.swing.JScrollPane();
        khtable1 = new javax.swing.JTable();
        bluekh1 = new javax.swing.JPanel();
        extbtn2 = new javax.swing.JLabel();
        getmanv3 = new javax.swing.JLabel();
        getidkh1 = new javax.swing.JTextField();
        getdc2 = new javax.swing.JLabel();
        getdckh1 = new javax.swing.JTextField();
        getsdt2 = new javax.swing.JLabel();
        getsdtkh1 = new javax.swing.JTextField();
        getmanv5 = new javax.swing.JLabel();
        gethtkh1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        deletekh1 = new javax.swing.JButton();
        updatenv1 = new javax.swing.JButton();
        searchbarkh = new javax.swing.JPanel();
        clear1 = new javax.swing.JLabel();
        searchkh = new javax.swing.JTextField();
        iconsearch1 = new javax.swing.JLabel();
        addkh1 = new javax.swing.JPanel();
        add1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        refreshkh = new javax.swing.JLabel();
        bluesp3 = new javax.swing.JPanel();
        extbtn3 = new javax.swing.JLabel();
        getmsp1 = new javax.swing.JTextField();
        getprice = new javax.swing.JLabel();
        getprice1 = new javax.swing.JTextField();
        getsl = new javax.swing.JLabel();
        getsl1 = new javax.swing.JTextField();
        getncc = new javax.swing.JLabel();
        getncc1 = new javax.swing.JTextField();
        getxx = new javax.swing.JLabel();
        getxx1 = new javax.swing.JTextField();
        getmasp = new javax.swing.JLabel();
        getnamesp = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        delsp1 = new javax.swing.JButton();
        updatesp1 = new javax.swing.JButton();
        sptable = new javax.swing.JScrollPane();
        sptable1 = new javax.swing.JTable();
        searchbarsp1 = new javax.swing.JPanel();
        clear2 = new javax.swing.JLabel();
        searchsp = new javax.swing.JTextField();
        iconsearch2 = new javax.swing.JLabel();
        addkh2 = new javax.swing.JPanel();
        add2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        refreshkh1 = new javax.swing.JLabel();
        ncctable = new javax.swing.JScrollPane();
        ncctable1 = new javax.swing.JTable();
        searchbarncc3 = new javax.swing.JPanel();
        clear3 = new javax.swing.JLabel();
        searchncc = new javax.swing.JTextField();
        iconsearch3 = new javax.swing.JLabel();
        addkh3 = new javax.swing.JPanel();
        add3 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        refreshncc = new javax.swing.JLabel();
        bluencc3 = new javax.swing.JPanel();
        extbtn5 = new javax.swing.JLabel();
        getidncc = new javax.swing.JTextField();
        dcncc = new javax.swing.JLabel();
        getdcncc = new javax.swing.JTextField();
        sdtncc = new javax.swing.JLabel();
        getsdtncc = new javax.swing.JTextField();
        idncc = new javax.swing.JLabel();
        gettenncc = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        deletencc = new javax.swing.JButton();
        updatencc = new javax.swing.JButton();
        tabledt = new javax.swing.JPanel();
        dt = new javax.swing.JScrollPane();
        dttable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        extbtn1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        getmonthstart = new javax.swing.JTextField();
        getmonthend = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        taikhoan = new javax.swing.JPanel();
        searchbartk = new javax.swing.JPanel();
        clear4 = new javax.swing.JLabel();
        searchtk = new javax.swing.JTextField();
        iconsearch4 = new javax.swing.JLabel();
        addtk = new javax.swing.JPanel();
        add4 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        refreshtk = new javax.swing.JLabel();
        bluetk = new javax.swing.JPanel();
        extbtn7 = new javax.swing.JLabel();
        gettentk = new javax.swing.JTextField();
        tenmk = new javax.swing.JLabel();
        getpass = new javax.swing.JTextField();
        deletetk = new javax.swing.JButton();
        uptk = new javax.swing.JButton();
        tentk1 = new javax.swing.JLabel();
        tablenv = new javax.swing.JScrollPane();
        tablenv1 = new javax.swing.JTable();
        tablead4 = new javax.swing.JScrollPane();
        tablead5 = new javax.swing.JTable();
        tenql = new javax.swing.JLabel();
        tennv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Harem Computer Management");
        setUndecorated(true);

        mother.setBackground(new java.awt.Color(132, 217, 255));
        mother.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                motherMouseDragged(evt);
            }
        });
        mother.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                motherMousePressed(evt);
            }
        });
        mother.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userbanner.setBackground(new java.awt.Color(132, 217, 255));
        userbanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/150vku.png"))); // NOI18N
        icon.setMaximumSize(new java.awt.Dimension(100, 100));
        icon.setMinimumSize(new java.awt.Dimension(100, 100));
        userbanner.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        hello.setBackground(new java.awt.Color(0, 0, 0));
        hello.setFont(new java.awt.Font("Haan Baekje M", 1, 24)); // NOI18N
        hello.setForeground(new java.awt.Color(255, 255, 255));
        hello.setText("안녕하세요");
        userbanner.add(hello, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        userbanner.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 220, -1));

        nhanvien.setBackground(new java.awt.Color(184, 228, 255));
        nhanvien.setForeground(new java.awt.Color(204, 204, 204));
        nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nhanvienMousePressed(evt);
            }
        });

        nvpanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout nvpanelLayout = new javax.swing.GroupLayout(nvpanel);
        nvpanel.setLayout(nvpanelLayout);
        nvpanelLayout.setHorizontalGroup(
            nvpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        nvpanelLayout.setVerticalGroup(
            nvpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        name1.setBackground(new java.awt.Color(0, 0, 0));
        name1.setFont(new java.awt.Font("Montserrat Medium", 1, 22)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("Nhân viên");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_user_20px_1.png"))); // NOI18N

        javax.swing.GroupLayout nhanvienLayout = new javax.swing.GroupLayout(nhanvien);
        nhanvien.setLayout(nhanvienLayout);
        nhanvienLayout.setHorizontalGroup(
            nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhanvienLayout.createSequentialGroup()
                .addComponent(nvpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(name1)
                .addGap(0, 99, Short.MAX_VALUE))
        );
        nhanvienLayout.setVerticalGroup(
            nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nvpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(nhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userbanner.add(nhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 300, 50));

        khach.setBackground(new java.awt.Color(132, 217, 255));
        khach.setForeground(new java.awt.Color(204, 204, 204));
        khach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                khachMousePressed(evt);
            }
        });

        khpanel.setBackground(new java.awt.Color(255, 255, 255));
        khpanel.setOpaque(false);

        javax.swing.GroupLayout khpanelLayout = new javax.swing.GroupLayout(khpanel);
        khpanel.setLayout(khpanelLayout);
        khpanelLayout.setHorizontalGroup(
            khpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        khpanelLayout.setVerticalGroup(
            khpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        kh2.setBackground(new java.awt.Color(0, 0, 0));
        kh2.setFont(new java.awt.Font("Montserrat Medium", 1, 22)); // NOI18N
        kh2.setForeground(new java.awt.Color(255, 255, 255));
        kh2.setText("Khách hàng");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_user_20px_1.png"))); // NOI18N

        javax.swing.GroupLayout khachLayout = new javax.swing.GroupLayout(khach);
        khach.setLayout(khachLayout);
        khachLayout.setHorizontalGroup(
            khachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachLayout.createSequentialGroup()
                .addComponent(khpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(kh2)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        khachLayout.setVerticalGroup(
            khachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(khpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(khachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(khachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kh2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userbanner.add(khach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 300, 50));

        sp.setBackground(new java.awt.Color(132, 217, 255));
        sp.setForeground(new java.awt.Color(204, 204, 204));
        sp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                spMousePressed(evt);
            }
        });

        sppanel.setBackground(new java.awt.Color(255, 255, 255));
        sppanel.setOpaque(false);

        javax.swing.GroupLayout sppanelLayout = new javax.swing.GroupLayout(sppanel);
        sppanel.setLayout(sppanelLayout);
        sppanelLayout.setHorizontalGroup(
            sppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        sppanelLayout.setVerticalGroup(
            sppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sp3.setBackground(new java.awt.Color(0, 0, 0));
        sp3.setFont(new java.awt.Font("Montserrat Medium", 1, 22)); // NOI18N
        sp3.setForeground(new java.awt.Color(255, 255, 255));
        sp3.setText("Sản phẩm");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_add_shopping_cart_20px.png"))); // NOI18N

        javax.swing.GroupLayout spLayout = new javax.swing.GroupLayout(sp);
        sp.setLayout(spLayout);
        spLayout.setHorizontalGroup(
            spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spLayout.createSequentialGroup()
                .addComponent(sppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(sp3)
                .addGap(0, 99, Short.MAX_VALUE))
        );
        spLayout.setVerticalGroup(
            spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(spLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userbanner.add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 300, 50));

        doanhthu.setBackground(new java.awt.Color(132, 217, 255));
        doanhthu.setForeground(new java.awt.Color(204, 204, 204));
        doanhthu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                doanhthuMousePressed(evt);
            }
        });

        dtpanel.setBackground(new java.awt.Color(255, 255, 255));
        dtpanel.setOpaque(false);

        javax.swing.GroupLayout dtpanelLayout = new javax.swing.GroupLayout(dtpanel);
        dtpanel.setLayout(dtpanelLayout);
        dtpanelLayout.setHorizontalGroup(
            dtpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        dtpanelLayout.setVerticalGroup(
            dtpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        hd1.setBackground(new java.awt.Color(0, 0, 0));
        hd1.setFont(new java.awt.Font("Montserrat Medium", 1, 22)); // NOI18N
        hd1.setForeground(new java.awt.Color(255, 255, 255));
        hd1.setText("Doanh thu");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_bill_20px.png"))); // NOI18N

        javax.swing.GroupLayout doanhthuLayout = new javax.swing.GroupLayout(doanhthu);
        doanhthu.setLayout(doanhthuLayout);
        doanhthuLayout.setHorizontalGroup(
            doanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doanhthuLayout.createSequentialGroup()
                .addComponent(dtpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(hd1)
                .addGap(0, 92, Short.MAX_VALUE))
        );
        doanhthuLayout.setVerticalGroup(
            doanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(doanhthuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doanhthuLayout.createSequentialGroup()
                        .addComponent(hd1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        userbanner.add(doanhthu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 300, 50));

        account.setBackground(new java.awt.Color(132, 217, 255));
        account.setForeground(new java.awt.Color(204, 204, 204));
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accountMousePressed(evt);
            }
        });

        accountpanel.setBackground(new java.awt.Color(255, 255, 255));
        accountpanel.setOpaque(false);

        javax.swing.GroupLayout accountpanelLayout = new javax.swing.GroupLayout(accountpanel);
        accountpanel.setLayout(accountpanelLayout);
        accountpanelLayout.setHorizontalGroup(
            accountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        accountpanelLayout.setVerticalGroup(
            accountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        npp5.setBackground(new java.awt.Color(0, 0, 0));
        npp5.setFont(new java.awt.Font("Montserrat Medium", 1, 22)); // NOI18N
        npp5.setForeground(new java.awt.Color(255, 255, 255));
        npp5.setText("Tài khoản");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_registration_20px.png"))); // NOI18N

        javax.swing.GroupLayout accountLayout = new javax.swing.GroupLayout(account);
        account.setLayout(accountLayout);
        accountLayout.setHorizontalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountLayout.createSequentialGroup()
                .addComponent(accountpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(npp5)
                .addGap(0, 103, Short.MAX_VALUE))
        );
        accountLayout.setVerticalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(accountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(npp5)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userbanner.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 300, 50));

        npp.setBackground(new java.awt.Color(132, 217, 255));
        npp.setForeground(new java.awt.Color(204, 204, 204));
        npp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nppMousePressed(evt);
            }
        });

        npppanel.setBackground(new java.awt.Color(255, 255, 255));
        npppanel.setOpaque(false);

        javax.swing.GroupLayout npppanelLayout = new javax.swing.GroupLayout(npppanel);
        npppanel.setLayout(npppanelLayout);
        npppanelLayout.setHorizontalGroup(
            npppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        npppanelLayout.setVerticalGroup(
            npppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        npp1.setBackground(new java.awt.Color(0, 0, 0));
        npp1.setFont(new java.awt.Font("Montserrat Medium", 1, 22)); // NOI18N
        npp1.setForeground(new java.awt.Color(255, 255, 255));
        npp1.setText("Nhà cung cấp");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_supplier_20px.png"))); // NOI18N

        javax.swing.GroupLayout nppLayout = new javax.swing.GroupLayout(npp);
        npp.setLayout(nppLayout);
        nppLayout.setHorizontalGroup(
            nppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nppLayout.createSequentialGroup()
                .addComponent(npppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(npp1)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        nppLayout.setVerticalGroup(
            nppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(npppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(nppLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(npp1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userbanner.add(npp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 300, 50));

        logout.setBackground(new java.awt.Color(132, 217, 255));
        logout.setForeground(new java.awt.Color(204, 204, 204));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        loutpanel.setBackground(new java.awt.Color(255, 255, 255));
        loutpanel.setOpaque(false);

        javax.swing.GroupLayout loutpanelLayout = new javax.swing.GroupLayout(loutpanel);
        loutpanel.setLayout(loutpanelLayout);
        loutpanelLayout.setHorizontalGroup(
            loutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        loutpanelLayout.setVerticalGroup(
            loutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lout1.setBackground(new java.awt.Color(0, 0, 0));
        lout1.setFont(new java.awt.Font("Montserrat Medium", 1, 22)); // NOI18N
        lout1.setForeground(new java.awt.Color(255, 255, 255));
        lout1.setText("Đăng xuất");
        lout1.setToolTipText("");
        lout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lout1MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Logout_20px.png"))); // NOI18N

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addComponent(loutpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(lout1)
                .addGap(0, 96, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loutpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lout1)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userbanner.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 300, 50));

        mother.add(userbanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 295, 780));

        leftbanner.setBackground(new java.awt.Color(245, 247, 251));
        leftbanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bluenv.setBackground(new java.awt.Color(132, 217, 255));
        bluenv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        extbtn.setFont(new java.awt.Font("Montserrat Black", 1, 24)); // NOI18N
        extbtn.setText("X");
        extbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extbtnMouseClicked(evt);
            }
        });
        bluenv.add(extbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 13, -1, -1));

        getmanv.setBackground(new java.awt.Color(255, 255, 255));
        getmanv.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        getmanv.setForeground(new java.awt.Color(255, 255, 255));
        getmanv.setText("Nhân viên");
        bluenv.add(getmanv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, -1));

        getmanv1.setBackground(new java.awt.Color(132, 217, 255));
        getmanv1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getmanv1.setForeground(new java.awt.Color(255, 255, 255));
        getmanv1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getmanv1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getmanv1.setEnabled(false);
        bluenv.add(getmanv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 160, 39));

        getns.setBackground(new java.awt.Color(255, 255, 255));
        getns.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getns.setForeground(new java.awt.Color(255, 255, 255));
        getns.setText("Ngày sinh");
        bluenv.add(getns, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        getns1.setBackground(new java.awt.Color(132, 217, 255));
        getns1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getns1.setForeground(new java.awt.Color(255, 255, 255));
        getns1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getns1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getns1.setEnabled(false);
        bluenv.add(getns1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 160, 39));

        getgt.setBackground(new java.awt.Color(255, 255, 255));
        getgt.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getgt.setForeground(new java.awt.Color(255, 255, 255));
        getgt.setText("Giới tính");
        bluenv.add(getgt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        getgt1.setBackground(new java.awt.Color(132, 217, 255));
        getgt1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getgt1.setForeground(new java.awt.Color(255, 255, 255));
        getgt1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getgt1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getgt1.setEnabled(false);
        bluenv.add(getgt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 160, 39));

        getcv.setBackground(new java.awt.Color(255, 255, 255));
        getcv.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getcv.setForeground(new java.awt.Color(255, 255, 255));
        getcv.setText("Chức vụ");
        bluenv.add(getcv, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        getcv1.setBackground(new java.awt.Color(132, 217, 255));
        getcv1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getcv1.setForeground(new java.awt.Color(255, 255, 255));
        getcv1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getcv1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        bluenv.add(getcv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 160, 39));

        getdc.setBackground(new java.awt.Color(255, 255, 255));
        getdc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getdc.setForeground(new java.awt.Color(255, 255, 255));
        getdc.setText("Địa chỉ");
        bluenv.add(getdc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        getdc1.setBackground(new java.awt.Color(132, 217, 255));
        getdc1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getdc1.setForeground(new java.awt.Color(255, 255, 255));
        getdc1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getdc1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        bluenv.add(getdc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 160, 39));

        getsdt.setBackground(new java.awt.Color(255, 255, 255));
        getsdt.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getsdt.setForeground(new java.awt.Color(255, 255, 255));
        getsdt.setText("SDT");
        bluenv.add(getsdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));

        getsdt1.setBackground(new java.awt.Color(132, 217, 255));
        getsdt1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getsdt1.setForeground(new java.awt.Color(255, 255, 255));
        getsdt1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getsdt1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        bluenv.add(getsdt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 160, 39));

        getmanv2.setBackground(new java.awt.Color(255, 255, 255));
        getmanv2.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getmanv2.setForeground(new java.awt.Color(255, 255, 255));
        getmanv2.setText("Mã NV");
        bluenv.add(getmanv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        getname.setBackground(new java.awt.Color(132, 217, 255));
        getname.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        getname.setForeground(new java.awt.Color(255, 255, 255));
        getname.setText("     ");
        getname.setToolTipText("");
        getname.setBorder(null);
        getname.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getname.setEnabled(false);
        bluenv.add(getname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 220, 30));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        bluenv.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 360, 20));

        deletenv.setBackground(new java.awt.Color(132, 217, 255));
        deletenv.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        deletenv.setForeground(new java.awt.Color(255, 255, 255));
        deletenv.setText("Xóa");
        deletenv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        deletenv.setFocusPainted(false);
        deletenv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletenvActionPerformed(evt);
            }
        });
        bluenv.add(deletenv, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 160, 50));

        updatenv.setBackground(new java.awt.Color(132, 217, 255));
        updatenv.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        updatenv.setForeground(new java.awt.Color(255, 255, 255));
        updatenv.setText("Cập nhật");
        updatenv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        updatenv.setFocusPainted(false);
        updatenv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatenvActionPerformed(evt);
            }
        });
        bluenv.add(updatenv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 160, 50));

        leftbanner.add(bluenv, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 430, 780));

        searchbarnv.setBackground(new java.awt.Color(245, 247, 251));
        searchbarnv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_multiply_20px.png"))); // NOI18N
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        searchbarnv.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 20, 20));

        searchnv.setBackground(new java.awt.Color(245, 247, 251));
        searchnv.setFont(new java.awt.Font("Montserrat Light", 2, 18)); // NOI18N
        searchnv.setText("Tìm kiếm");
        searchnv.setBorder(null);
        searchnv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchnvMouseClicked(evt);
            }
        });
        searchbarnv.add(searchnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 33, 220, 34));

        iconsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_search_20px_1.png"))); // NOI18N
        iconsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconsearchMouseClicked(evt);
            }
        });
        searchbarnv.add(iconsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 40));

        addnv.setBackground(new java.awt.Color(245, 247, 251));
        addnv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_plus_math_20px.png"))); // NOI18N
        add.setText("  Thêm nhân viên");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        addnv.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        searchbarnv.add(addnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 200, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(245, 247, 251));
        searchbarnv.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 250, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_refresh_20px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        searchbarnv.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        leftbanner.add(searchbarnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 90));

        nvtable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        nvtable1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        nvtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ tên", "Ngày sinh", "Giới tính", "Chức vụ", "Địa chỉ", "SDT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nvtable1.setFocusable(false);
        nvtable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        nvtable1.setRowHeight(40);
        nvtable1.setSelectionBackground(new java.awt.Color(254, 201, 201));
        nvtable1.setShowVerticalLines(false);
        nvtable1.getTableHeader().setReorderingAllowed(false);
        nvtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nvtable1MouseClicked(evt);
            }
        });
        nvtable.setViewportView(nvtable1);

        leftbanner.add(nvtable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 890, 270));

        khtable1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        khtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        khtable1.setFocusable(false);
        khtable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        khtable1.setRowHeight(40);
        khtable1.setSelectionBackground(new java.awt.Color(254, 201, 201));
        khtable1.setShowVerticalLines(false);
        khtable1.getTableHeader().setReorderingAllowed(false);
        khtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khtable1MouseClicked(evt);
            }
        });
        khtable.setViewportView(khtable1);

        leftbanner.add(khtable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 890, 270));

        bluekh1.setBackground(new java.awt.Color(132, 217, 255));
        bluekh1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        extbtn2.setFont(new java.awt.Font("Montserrat Black", 1, 24)); // NOI18N
        extbtn2.setText("X");
        extbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extbtn2MouseClicked(evt);
            }
        });
        bluekh1.add(extbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 13, -1, -1));

        getmanv3.setBackground(new java.awt.Color(255, 255, 255));
        getmanv3.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 20)); // NOI18N
        getmanv3.setForeground(new java.awt.Color(255, 255, 255));
        getmanv3.setText("Khách hàng");
        bluekh1.add(getmanv3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, -1));

        getidkh1.setBackground(new java.awt.Color(132, 217, 255));
        getidkh1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getidkh1.setForeground(new java.awt.Color(255, 255, 255));
        getidkh1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getidkh1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getidkh1.setEnabled(false);
        bluekh1.add(getidkh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 360, 39));

        getdc2.setBackground(new java.awt.Color(255, 255, 255));
        getdc2.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getdc2.setForeground(new java.awt.Color(255, 255, 255));
        getdc2.setText("Địa chỉ");
        bluekh1.add(getdc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        getdckh1.setBackground(new java.awt.Color(132, 217, 255));
        getdckh1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getdckh1.setForeground(new java.awt.Color(255, 255, 255));
        getdckh1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getdckh1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        bluekh1.add(getdckh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 160, 39));

        getsdt2.setBackground(new java.awt.Color(255, 255, 255));
        getsdt2.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getsdt2.setForeground(new java.awt.Color(255, 255, 255));
        getsdt2.setText("SDT");
        bluekh1.add(getsdt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        getsdtkh1.setBackground(new java.awt.Color(132, 217, 255));
        getsdtkh1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getsdtkh1.setForeground(new java.awt.Color(255, 255, 255));
        getsdtkh1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getsdtkh1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        bluekh1.add(getsdtkh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 160, 39));

        getmanv5.setBackground(new java.awt.Color(255, 255, 255));
        getmanv5.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getmanv5.setForeground(new java.awt.Color(255, 255, 255));
        getmanv5.setText("Mã KH");
        bluekh1.add(getmanv5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        gethtkh1.setBackground(new java.awt.Color(132, 217, 255));
        gethtkh1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        gethtkh1.setForeground(new java.awt.Color(255, 255, 255));
        gethtkh1.setText("     ");
        gethtkh1.setToolTipText("");
        gethtkh1.setBorder(null);
        gethtkh1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        gethtkh1.setEnabled(false);
        bluekh1.add(gethtkh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 220, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        bluekh1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 360, 20));

        deletekh1.setBackground(new java.awt.Color(132, 217, 255));
        deletekh1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        deletekh1.setForeground(new java.awt.Color(255, 255, 255));
        deletekh1.setText("Xóa");
        deletekh1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        deletekh1.setFocusPainted(false);
        deletekh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletekh1ActionPerformed(evt);
            }
        });
        bluekh1.add(deletekh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 160, 50));

        updatenv1.setBackground(new java.awt.Color(132, 217, 255));
        updatenv1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        updatenv1.setForeground(new java.awt.Color(255, 255, 255));
        updatenv1.setText("Cập nhật");
        updatenv1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        updatenv1.setFocusPainted(false);
        updatenv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatenv1ActionPerformed(evt);
            }
        });
        bluekh1.add(updatenv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 160, 50));

        leftbanner.add(bluekh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 430, 780));

        searchbarkh.setBackground(new java.awt.Color(245, 247, 251));
        searchbarkh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_multiply_20px.png"))); // NOI18N
        clear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear1MouseClicked(evt);
            }
        });
        searchbarkh.add(clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 20, 20));

        searchkh.setBackground(new java.awt.Color(245, 247, 251));
        searchkh.setFont(new java.awt.Font("Montserrat Light", 2, 18)); // NOI18N
        searchkh.setText("Tìm kiếm");
        searchkh.setBorder(null);
        searchkh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchkhMouseClicked(evt);
            }
        });
        searchbarkh.add(searchkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 33, 220, 34));

        iconsearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_search_20px_1.png"))); // NOI18N
        iconsearch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconsearch1MouseClicked(evt);
            }
        });
        searchbarkh.add(iconsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 40));

        addkh1.setBackground(new java.awt.Color(245, 247, 251));
        addkh1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add1.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_plus_math_20px.png"))); // NOI18N
        add1.setText("  Thêm khách hàng");
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
        });
        addkh1.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 40));

        searchbarkh.add(addkh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 230, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(245, 247, 251));
        searchbarkh.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 250, -1));

        refreshkh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_refresh_20px.png"))); // NOI18N
        refreshkh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshkhMouseClicked(evt);
            }
        });
        searchbarkh.add(refreshkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        leftbanner.add(searchbarkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 90));

        bluesp3.setBackground(new java.awt.Color(132, 217, 255));
        bluesp3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        extbtn3.setFont(new java.awt.Font("Montserrat Black", 1, 24)); // NOI18N
        extbtn3.setText("X");
        extbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extbtn3MouseClicked(evt);
            }
        });
        bluesp3.add(extbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 13, -1, -1));

        getmsp1.setBackground(new java.awt.Color(132, 217, 255));
        getmsp1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getmsp1.setForeground(new java.awt.Color(255, 255, 255));
        getmsp1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getmsp1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getmsp1.setEnabled(false);
        bluesp3.add(getmsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 160, 39));

        getprice.setBackground(new java.awt.Color(255, 255, 255));
        getprice.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getprice.setForeground(new java.awt.Color(255, 255, 255));
        getprice.setText("Giá bán");
        bluesp3.add(getprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        getprice1.setBackground(new java.awt.Color(132, 217, 255));
        getprice1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getprice1.setForeground(new java.awt.Color(255, 255, 255));
        getprice1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getprice1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        bluesp3.add(getprice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 160, 39));

        getsl.setBackground(new java.awt.Color(255, 255, 255));
        getsl.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getsl.setForeground(new java.awt.Color(255, 255, 255));
        getsl.setText("Số lượng");
        bluesp3.add(getsl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        getsl1.setBackground(new java.awt.Color(132, 217, 255));
        getsl1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getsl1.setForeground(new java.awt.Color(255, 255, 255));
        getsl1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getsl1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        bluesp3.add(getsl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 160, 39));

        getncc.setBackground(new java.awt.Color(255, 255, 255));
        getncc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getncc.setForeground(new java.awt.Color(255, 255, 255));
        getncc.setText("Nhà cung cấp");
        bluesp3.add(getncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        getncc1.setBackground(new java.awt.Color(132, 217, 255));
        getncc1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getncc1.setForeground(new java.awt.Color(255, 255, 255));
        getncc1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getncc1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getncc1.setEnabled(false);
        bluesp3.add(getncc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 160, 39));

        getxx.setBackground(new java.awt.Color(255, 255, 255));
        getxx.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getxx.setForeground(new java.awt.Color(255, 255, 255));
        getxx.setText("Xuất xứ");
        bluesp3.add(getxx, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        getxx1.setBackground(new java.awt.Color(132, 217, 255));
        getxx1.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getxx1.setForeground(new java.awt.Color(255, 255, 255));
        getxx1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getxx1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getxx1.setEnabled(false);
        bluesp3.add(getxx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 360, 39));

        getmasp.setBackground(new java.awt.Color(255, 255, 255));
        getmasp.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        getmasp.setForeground(new java.awt.Color(255, 255, 255));
        getmasp.setText("Mã SP");
        bluesp3.add(getmasp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        getnamesp.setBackground(new java.awt.Color(132, 217, 255));
        getnamesp.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        getnamesp.setForeground(new java.awt.Color(255, 255, 255));
        getnamesp.setText("     ");
        getnamesp.setToolTipText("");
        getnamesp.setBorder(null);
        getnamesp.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getnamesp.setEnabled(false);
        bluesp3.add(getnamesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 370, 30));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        bluesp3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 360, 20));

        delsp1.setBackground(new java.awt.Color(132, 217, 255));
        delsp1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        delsp1.setForeground(new java.awt.Color(255, 255, 255));
        delsp1.setText("Xóa");
        delsp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        delsp1.setFocusable(false);
        delsp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delsp1ActionPerformed(evt);
            }
        });
        bluesp3.add(delsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 160, 50));

        updatesp1.setBackground(new java.awt.Color(132, 217, 255));
        updatesp1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        updatesp1.setForeground(new java.awt.Color(255, 255, 255));
        updatesp1.setText("Cập nhật");
        updatesp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        updatesp1.setFocusable(false);
        updatesp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatesp1ActionPerformed(evt);
            }
        });
        bluesp3.add(updatesp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 160, 50));

        leftbanner.add(bluesp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 430, 780));

        sptable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        sptable1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        sptable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        sptable1.setFocusable(false);
        sptable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        sptable1.setRowHeight(40);
        sptable1.setSelectionBackground(new java.awt.Color(254, 201, 201));
        sptable1.setShowVerticalLines(false);
        sptable1.getTableHeader().setReorderingAllowed(false);
        sptable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sptable1MouseClicked(evt);
            }
        });
        sptable.setViewportView(sptable1);

        leftbanner.add(sptable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 890, 270));

        searchbarsp1.setBackground(new java.awt.Color(245, 247, 251));
        searchbarsp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_multiply_20px.png"))); // NOI18N
        clear2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear2MouseClicked(evt);
            }
        });
        searchbarsp1.add(clear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 20, 20));

        searchsp.setBackground(new java.awt.Color(245, 247, 251));
        searchsp.setFont(new java.awt.Font("Montserrat Light", 2, 18)); // NOI18N
        searchsp.setText("Tìm kiếm");
        searchsp.setBorder(null);
        searchsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchspMouseClicked(evt);
            }
        });
        searchbarsp1.add(searchsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 33, 220, 34));

        iconsearch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_search_20px_1.png"))); // NOI18N
        iconsearch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconsearch2MouseClicked(evt);
            }
        });
        searchbarsp1.add(iconsearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 40));

        addkh2.setBackground(new java.awt.Color(245, 247, 251));
        addkh2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add2.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_plus_math_20px.png"))); // NOI18N
        add2.setText("  Thêm sản phẩm");
        add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add2MouseClicked(evt);
            }
        });
        addkh2.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 40));

        searchbarsp1.add(addkh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 230, 40));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(245, 247, 251));
        searchbarsp1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 250, -1));

        refreshkh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_refresh_20px.png"))); // NOI18N
        refreshkh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshkh1MouseClicked(evt);
            }
        });
        searchbarsp1.add(refreshkh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        leftbanner.add(searchbarsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 90));

        ncctable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        ncctable1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ncctable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ncctable1.setFocusable(false);
        ncctable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ncctable1.setRowHeight(40);
        ncctable1.setSelectionBackground(new java.awt.Color(254, 201, 201));
        ncctable1.setShowVerticalLines(false);
        ncctable1.getTableHeader().setReorderingAllowed(false);
        ncctable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ncctable1MouseClicked(evt);
            }
        });
        ncctable.setViewportView(ncctable1);

        leftbanner.add(ncctable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 890, 270));

        searchbarncc3.setBackground(new java.awt.Color(245, 247, 251));
        searchbarncc3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_multiply_20px.png"))); // NOI18N
        clear3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear3MouseClicked(evt);
            }
        });
        searchbarncc3.add(clear3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 20, 20));

        searchncc.setBackground(new java.awt.Color(245, 247, 251));
        searchncc.setFont(new java.awt.Font("Montserrat Light", 2, 18)); // NOI18N
        searchncc.setText("Tìm kiếm");
        searchncc.setBorder(null);
        searchncc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchnccMouseClicked(evt);
            }
        });
        searchbarncc3.add(searchncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 33, 220, 34));

        iconsearch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_search_20px_1.png"))); // NOI18N
        iconsearch3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconsearch3MouseClicked(evt);
            }
        });
        searchbarncc3.add(iconsearch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 40));

        addkh3.setBackground(new java.awt.Color(245, 247, 251));
        addkh3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add3.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        add3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_plus_math_20px.png"))); // NOI18N
        add3.setText("  Thêm nhà cung cấp");
        add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add3MouseClicked(evt);
            }
        });
        addkh3.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 40));

        searchbarncc3.add(addkh3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 230, 40));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(245, 247, 251));
        searchbarncc3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 250, -1));

        refreshncc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_refresh_20px.png"))); // NOI18N
        refreshncc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshnccMouseClicked(evt);
            }
        });
        searchbarncc3.add(refreshncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        leftbanner.add(searchbarncc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 90));

        bluencc3.setBackground(new java.awt.Color(132, 217, 255));
        bluencc3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        extbtn5.setFont(new java.awt.Font("Montserrat Black", 1, 24)); // NOI18N
        extbtn5.setText("X");
        extbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extbtn5MouseClicked(evt);
            }
        });
        bluencc3.add(extbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 13, -1, -1));

        getidncc.setBackground(new java.awt.Color(132, 217, 255));
        getidncc.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getidncc.setForeground(new java.awt.Color(255, 255, 255));
        getidncc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getidncc.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getidncc.setEnabled(false);
        bluencc3.add(getidncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 360, 39));

        dcncc.setBackground(new java.awt.Color(255, 255, 255));
        dcncc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        dcncc.setForeground(new java.awt.Color(255, 255, 255));
        dcncc.setText("Địa chỉ");
        bluencc3.add(dcncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        getdcncc.setBackground(new java.awt.Color(132, 217, 255));
        getdcncc.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getdcncc.setForeground(new java.awt.Color(255, 255, 255));
        getdcncc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getdcncc.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        bluencc3.add(getdcncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 160, 39));

        sdtncc.setBackground(new java.awt.Color(255, 255, 255));
        sdtncc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        sdtncc.setForeground(new java.awt.Color(255, 255, 255));
        sdtncc.setText("SDT");
        bluencc3.add(sdtncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        getsdtncc.setBackground(new java.awt.Color(132, 217, 255));
        getsdtncc.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getsdtncc.setForeground(new java.awt.Color(255, 255, 255));
        getsdtncc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getsdtncc.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        bluencc3.add(getsdtncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 160, 39));

        idncc.setBackground(new java.awt.Color(255, 255, 255));
        idncc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        idncc.setForeground(new java.awt.Color(255, 255, 255));
        idncc.setText("Mã Nhà cung cấp");
        bluencc3.add(idncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        gettenncc.setBackground(new java.awt.Color(132, 217, 255));
        gettenncc.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        gettenncc.setForeground(new java.awt.Color(255, 255, 255));
        gettenncc.setText("     ");
        gettenncc.setToolTipText("");
        gettenncc.setBorder(null);
        gettenncc.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        gettenncc.setEnabled(false);
        bluencc3.add(gettenncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 360, -1));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        bluencc3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 360, 20));

        deletencc.setBackground(new java.awt.Color(132, 217, 255));
        deletencc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        deletencc.setForeground(new java.awt.Color(255, 255, 255));
        deletencc.setText("Xóa");
        deletencc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        deletencc.setFocusable(false);
        deletencc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletenccActionPerformed(evt);
            }
        });
        bluencc3.add(deletencc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 160, 50));

        updatencc.setBackground(new java.awt.Color(132, 217, 255));
        updatencc.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        updatencc.setForeground(new java.awt.Color(255, 255, 255));
        updatencc.setText("Cập nhật");
        updatencc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        updatencc.setFocusable(false);
        updatencc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatenccActionPerformed(evt);
            }
        });
        bluencc3.add(updatencc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 160, 50));

        leftbanner.add(bluencc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 430, 780));

        tabledt.setBackground(new java.awt.Color(245, 247, 251));
        tabledt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        dttable.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        dttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        dttable.setFocusable(false);
        dttable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        dttable.setRowHeight(40);
        dttable.setSelectionBackground(new java.awt.Color(254, 201, 201));
        dttable.setShowVerticalLines(false);
        dttable.getTableHeader().setReorderingAllowed(false);
        dt.setViewportView(dttable);

        tabledt.add(dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1320, 460));

        jPanel1.setBackground(new java.awt.Color(224, 251, 252));

        extbtn1.setFont(new java.awt.Font("Montserrat Black", 1, 24)); // NOI18N
        extbtn1.setText("X");
        extbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extbtn1MouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(224, 251, 252));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 269));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        jLabel8.setText("Thống kê doanh thu từ tháng");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 380, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        jLabel9.setText("tới tháng");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        getmonthstart.setBackground(new java.awt.Color(224, 251, 252));
        getmonthstart.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        getmonthstart.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(getmonthstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 50, 30));

        getmonthend.setBackground(new java.awt.Color(224, 251, 252));
        getmonthend.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        getmonthend.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(getmonthend, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 50, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        jButton4.setText("Hiển thị toàn bộ");
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, 190, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        jButton2.setText("Tính toán");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 127, 40));

        tong.setBackground(new java.awt.Color(224, 251, 252));
        tong.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 60)); // NOI18N
        tong.setForeground(new java.awt.Color(219, 10, 19));
        tong.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tong.setDisabledTextColor(new java.awt.Color(219, 10, 19));
        tong.setEnabled(false);
        jPanel4.add(tong, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 500, 70));

        jLabel10.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 106, 51));
        jLabel10.setText("DOANH THU CHI TIẾT 2021");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extbtn1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(extbtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        tabledt.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 320));

        leftbanner.add(tabledt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 780));

        mother.add(leftbanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 0, 1319, -1));

        taikhoan.setBackground(new java.awt.Color(245, 247, 251));
        taikhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchbartk.setBackground(new java.awt.Color(245, 247, 251));
        searchbartk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_multiply_20px.png"))); // NOI18N
        clear4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear4MouseClicked(evt);
            }
        });
        searchbartk.add(clear4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 20, 20));

        searchtk.setBackground(new java.awt.Color(245, 247, 251));
        searchtk.setFont(new java.awt.Font("Montserrat Light", 2, 18)); // NOI18N
        searchtk.setText("Tìm kiếm");
        searchtk.setBorder(null);
        searchtk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchtkMouseClicked(evt);
            }
        });
        searchbartk.add(searchtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 33, 220, 34));

        iconsearch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_search_20px_1.png"))); // NOI18N
        iconsearch4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconsearch4MouseClicked(evt);
            }
        });
        searchbartk.add(iconsearch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 40));

        addtk.setBackground(new java.awt.Color(245, 247, 251));
        addtk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add4.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        add4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_plus_math_20px.png"))); // NOI18N
        add4.setText("  Thêm tài khoản");
        add4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add4MouseClicked(evt);
            }
        });
        addtk.add(add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 40));

        searchbartk.add(addtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 230, 40));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(245, 247, 251));
        searchbartk.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 250, -1));

        refreshtk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_refresh_20px.png"))); // NOI18N
        refreshtk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshtkMouseClicked(evt);
            }
        });
        searchbartk.add(refreshtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        taikhoan.add(searchbartk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 90));

        bluetk.setBackground(new java.awt.Color(132, 217, 255));
        bluetk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        extbtn7.setFont(new java.awt.Font("Montserrat Black", 1, 24)); // NOI18N
        extbtn7.setText("X");
        extbtn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extbtn7MouseClicked(evt);
            }
        });
        bluetk.add(extbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 13, -1, -1));

        gettentk.setBackground(new java.awt.Color(132, 217, 255));
        gettentk.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        gettentk.setForeground(new java.awt.Color(255, 255, 255));
        gettentk.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        gettentk.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        gettentk.setEnabled(false);
        bluetk.add(gettentk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 360, 39));

        tenmk.setBackground(new java.awt.Color(255, 255, 255));
        tenmk.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        tenmk.setForeground(new java.awt.Color(255, 255, 255));
        tenmk.setText("Mật khẩu");
        bluetk.add(tenmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        getpass.setBackground(new java.awt.Color(132, 217, 255));
        getpass.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        getpass.setForeground(new java.awt.Color(255, 255, 255));
        getpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        getpass.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        bluetk.add(getpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 360, 39));

        deletetk.setBackground(new java.awt.Color(132, 217, 255));
        deletetk.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        deletetk.setForeground(new java.awt.Color(255, 255, 255));
        deletetk.setText("Xóa");
        deletetk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        deletetk.setFocusable(false);
        deletetk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletetkActionPerformed(evt);
            }
        });
        bluetk.add(deletetk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 160, 50));

        uptk.setBackground(new java.awt.Color(132, 217, 255));
        uptk.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        uptk.setForeground(new java.awt.Color(255, 255, 255));
        uptk.setText("Cập nhật");
        uptk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        uptk.setFocusable(false);
        uptk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uptkActionPerformed(evt);
            }
        });
        bluetk.add(uptk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 160, 50));

        tentk1.setBackground(new java.awt.Color(255, 255, 255));
        tentk1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        tentk1.setForeground(new java.awt.Color(255, 255, 255));
        tentk1.setText("Tài khoản");
        bluetk.add(tentk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        taikhoan.add(bluetk, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 430, 780));

        tablenv.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        tablenv1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        tablenv1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tablenv1.setFocusable(false);
        tablenv1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablenv1.setRowHeight(40);
        tablenv1.setSelectionBackground(new java.awt.Color(254, 201, 201));
        tablenv1.setShowVerticalLines(false);
        tablenv1.getTableHeader().setReorderingAllowed(false);
        tablenv1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablenv1MouseClicked(evt);
            }
        });
        tablenv.setViewportView(tablenv1);

        taikhoan.add(tablenv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 890, 230));

        tablead4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        tablead5.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        tablead5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tablead5.setFocusable(false);
        tablead5.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablead5.setRowHeight(40);
        tablead5.setSelectionBackground(new java.awt.Color(254, 201, 201));
        tablead5.setShowVerticalLines(false);
        tablead5.getTableHeader().setReorderingAllowed(false);
        tablead5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablead5MouseClicked(evt);
            }
        });
        tablead4.setViewportView(tablead5);

        taikhoan.add(tablead4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 890, 230));

        tenql.setBackground(new java.awt.Color(255, 255, 255));
        tenql.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        tenql.setText("Quản lý");
        taikhoan.add(tenql, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        tennv.setBackground(new java.awt.Color(255, 255, 255));
        tennv.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        tennv.setText("Nhân viên");
        taikhoan.add(tennv, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        mother.add(taikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 0, 1320, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void extbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extbtnMouseClicked
       System.exit (0);
    }//GEN-LAST:event_extbtnMouseClicked
    
    private void setMau (JPanel mau) {
        mau.setBackground(new Color (184,228,255));
    }
    private void resetMau (JPanel [] mau, JPanel [] so) {
        for (int i = 0; i < mau.length; i++) {
            mau [i].setBackground(new Color(132,217,255));
        }
        for (int i = 0; i < so.length; i++) {
            so [i].setOpaque(false);
        } 
    }
      
    private void nhanvienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhanvienMousePressed
        setMau(nhanvien);
        nvpanel.setOpaque(true);
        resetMau(new JPanel[] {khach, sp, doanhthu, npp, logout, account}, new JPanel [] {khpanel, sppanel, dtpanel,npppanel, loutpanel, accountpanel});  
           
        taikhoan.setVisible(false);
        leftbanner.setVisible(true);
        
        khtable.setVisible(false);
        searchbarkh.setVisible(false);
        bluekh1.setVisible(false);
        
        sptable.setVisible(false);
        searchbarsp1.setVisible(false);
        bluesp3.setVisible(false);
        
        ncctable.setVisible(false);
        searchbarncc3.setVisible(false);
        bluencc3.setVisible(false);
        
        tabledt.setVisible(false);
              
        nvtable.setVisible(true);
        searchbarnv.setVisible(true);
        bluenv.setVisible(true);
                  
    }//GEN-LAST:event_nhanvienMousePressed

    private void khachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachMousePressed
        setMau(khach);
        khpanel.setOpaque(true);
        resetMau(new JPanel[] {nhanvien, sp, doanhthu, npp, logout, account}, new JPanel [] {nvpanel, sppanel, dtpanel,npppanel, loutpanel, accountpanel});  
        
        khtable.setVisible(true);
        searchbarkh.setVisible(true);
        bluekh1.setVisible(true);
        
        nvtable.setVisible(false);
        searchbarnv.setVisible(false);
        bluenv.setVisible(false);
        
        sptable.setVisible(false);
        searchbarsp1.setVisible(false);
        bluesp3.setVisible(false);
        
        ncctable.setVisible(false);
        searchbarncc3.setVisible(false);
        bluencc3.setVisible(false);
        
        tabledt.setVisible(false);
        
        taikhoan.setVisible(false);
        leftbanner.setVisible(true);
          
    }//GEN-LAST:event_khachMousePressed

    private void spMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spMousePressed
        setMau(sp);
        sppanel.setOpaque(true);
        resetMau(new JPanel[] {khach, nhanvien, doanhthu, npp, logout, account}, new JPanel [] {khpanel, nvpanel, dtpanel,npppanel, loutpanel, accountpanel});
        
        sptable.setVisible(true);
        searchbarsp1.setVisible(true);
        bluesp3.setVisible(true);
        
        khtable.setVisible(false);
        searchbarkh.setVisible(false);
        bluekh1.setVisible(false);
        
        nvtable.setVisible(false);
        searchbarnv.setVisible(false);
        bluenv.setVisible(false);
        
        ncctable.setVisible(false);
        searchbarncc3.setVisible(false);
        bluencc3.setVisible(false);
        
        tabledt.setVisible(false);
        taikhoan.setVisible(false);
        leftbanner.setVisible(true);
        
   
    }//GEN-LAST:event_spMousePressed

    private void doanhthuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doanhthuMousePressed
        setMau(doanhthu);
        dtpanel.setOpaque(true);
        resetMau(new JPanel[] {khach, sp, nhanvien, npp, logout, account}, new JPanel [] {khpanel, sppanel, nvpanel,npppanel, loutpanel, accountpanel}); 
        
        tabledt.setVisible(true);
        
        khtable.setVisible(false);
        searchbarkh.setVisible(false);
        bluekh1.setVisible(false);
        
        nvtable.setVisible(false);
        searchbarnv.setVisible(false);
        bluenv.setVisible(false);
        
        sptable.setVisible(false);
        searchbarsp1.setVisible(false);
        bluesp3.setVisible(false);
        
        ncctable.setVisible(false);
        searchbarncc3.setVisible(false);
        bluencc3.setVisible(false);
        
        taikhoan.setVisible(false);
        leftbanner.setVisible(true);
        
        
    }//GEN-LAST:event_doanhthuMousePressed

    private void nppMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nppMousePressed
        setMau(npp);
        npppanel.setOpaque(true);
        resetMau(new JPanel[] {khach, sp, doanhthu, nhanvien, logout, account}, new JPanel [] {khpanel, sppanel, dtpanel,nvpanel, loutpanel, accountpanel});  
        
        ncctable.setVisible(true);
        bluencc3.setVisible(true);
        searchbarncc3.setVisible(true);
        
        khtable.setVisible(false);
        searchbarkh.setVisible(false);
        bluekh1.setVisible(false);
        
        nvtable.setVisible(false);
        searchbarnv.setVisible(false);
        bluenv.setVisible(false);
        
        sptable.setVisible(false);
        searchbarsp1.setVisible(false);
        bluesp3.setVisible(false);
        
        tabledt.setVisible(false);
        
        taikhoan.setVisible(false);
        leftbanner.setVisible(true);

    }//GEN-LAST:event_nppMousePressed

    private void searchnvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchnvMouseClicked
        searchnv.setText("");
    }//GEN-LAST:event_searchnvMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        searchnv.setText("Tìm kiếm");
        loaddatanv();
        refresh();
    }//GEN-LAST:event_clearMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        AddPeople add = new AddPeople();
        add.setVisible (true);
    }//GEN-LAST:event_addMouseClicked

    private void motherMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motherMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_motherMousePressed

    private void motherMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motherMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);      
    }//GEN-LAST:event_motherMouseDragged

    private void lout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lout1MouseClicked
        dispose ();
        Login moi = new Login ();
        moi.setVisible (true);
    }//GEN-LAST:event_lout1MouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dispose ();
        Login moi = new Login ();
        moi.setVisible (true);
    }//GEN-LAST:event_logoutMouseClicked

    private void nvtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nvtable1MouseClicked
        int row = nvtable1.getSelectedRow();
        if (row >= 0) {
           getname.setText(nvtable1.getValueAt(row, 1).toString());
           getmanv1.setText(nvtable1.getValueAt(row, 0).toString());
           getns1.setText(nvtable1.getValueAt(row, 2).toString());
           getgt1.setText(nvtable1.getValueAt(row, 3).toString());
           getcv1.setText(nvtable1.getValueAt(row, 4).toString());
           getsdt1.setText(nvtable1.getValueAt(row, 6).toString());
           getdc1.setText(nvtable1.getValueAt(row, 5).toString());
           
       }
    }//GEN-LAST:event_nvtable1MouseClicked
 
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        loaddatanv();
    }//GEN-LAST:event_jLabel3MouseClicked
    private void refresh () {
        getname.setText("");
        getmanv1.setText("");
        getns1.setText("");
        getgt1.setText("");
        getcv1.setText("");
        getsdt1.setText("");
        getdc1.setText("");        
    }
    private void refreshkh() {
        getidkh1.setText("");
        gethtkh1.setText("");           
        getdckh1.setText("");
        getsdtkh1.setText("");
    }
    private void refreshsp() {
        getnamesp.setText(""); 
        getmsp1.setText("");
        getprice1.setText("");
        getsl1.setText("");
        getncc1.setText("");
        getxx1.setText("");
    }
    private void refreshncc() {
        getidncc.setText("");
        gettenncc.setText("");
        getdcncc.setText("");
        getsdtncc.setText("");
    }
    private void refreshad() {
        gettentk.setText("");
        getpass.setText("");
    }
    private void refreshnv() {
        gettentk.setText("");
        getpass.setText("");
    }
    
    private void deletenvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletenvActionPerformed
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()) {
                       
            PreparedStatement delnv = conn.prepareStatement("delete from nhanvien where id_nv = ?");
            
            delnv.setString(1, getmanv1.getText());
   
            delnv.executeUpdate();
            
            noticlear clear = new noticlear();
            clear.setVisible(true);
            
            refresh();
            loaddatanv();
            delnv.close();
            conn.close();     
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }//GEN-LAST:event_deletenvActionPerformed

    private void updatenvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatenvActionPerformed
        
        
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
                
        try (Connection conn = ds.getConnection()) {                       
            PreparedStatement upnv = conn.prepareStatement("update nhanvien set chucvu = ?, dc = ?, sdt = ?" 
                                                            + "       where id_nv = ?");
                    
            upnv.setString(1, getcv1.getText());
            upnv.setString(2, getdc1.getText());
            upnv.setString(3, getsdt1.getText());
            upnv.setString(4, getmanv1.getText());
              
            upnv.executeUpdate();
            notiupdate notiup = new notiupdate();
            notiup.setVisible(true);
            
            refresh();
            loaddatanv();
            upnv.close();
            conn.close();      
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }//GEN-LAST:event_updatenvActionPerformed

    private void extbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extbtn2MouseClicked
        System.exit (0);
    }//GEN-LAST:event_extbtn2MouseClicked

    private void deletekh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletekh1ActionPerformed
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()) {
            PreparedStatement delkh = conn.prepareStatement("delete from khachhang where id_kh = ?");
            
            delkh.setString(1, getidkh1.getText());
                       
            delkh.executeUpdate();
            noticlear clear = new noticlear();
            clear.setVisible(true);
            
            refreshkh();
            loaddatakh();
            delkh.close();
            conn.close();
                      
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }//GEN-LAST:event_deletekh1ActionPerformed

    private void updatenv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatenv1ActionPerformed
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
                
        try (Connection conn = ds.getConnection()) {
         
            PreparedStatement upkh = conn.prepareStatement("update khachhang set diachikh = ?, sdtkh = ?" 
                                                            + "       where id_kh = ?");
                    
            upkh.setString(1, getdckh1.getText());
            upkh.setString(2, getsdtkh1.getText());
            upkh.setString(3, getidkh1.getText());
              
            upkh.executeUpdate();
            notiupdate notiup = new notiupdate();
            notiup.setVisible(true);
            
            refresh();
            loaddatakh();
            upkh.close();
            conn.close();      
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }//GEN-LAST:event_updatenv1ActionPerformed

    private void khtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khtable1MouseClicked
        int row = khtable1.getSelectedRow();
        if (row >= 0) {
           getidkh1.setText(khtable1.getValueAt(row, 0).toString());
           gethtkh1.setText(khtable1.getValueAt(row, 1).toString());           
           getdckh1.setText(khtable1.getValueAt(row, 2).toString());
           getsdtkh1.setText(khtable1.getValueAt(row, 3).toString());
       }
    }//GEN-LAST:event_khtable1MouseClicked

    private void clear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear1MouseClicked
        searchkh.setText("Tìm kiếm");
        refreshkh();
    }//GEN-LAST:event_clear1MouseClicked

    private void searchkhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchkhMouseClicked
        searchkh.setText("");
    }//GEN-LAST:event_searchkhMouseClicked

    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
        AddKH addkh = new AddKH();
        addkh.setVisible (true);
    }//GEN-LAST:event_add1MouseClicked

    private void refreshkhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshkhMouseClicked
        loaddatakh();
    }//GEN-LAST:event_refreshkhMouseClicked

    private void extbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extbtn3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_extbtn3MouseClicked

    private void delsp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delsp1ActionPerformed
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()) {
            PreparedStatement pr = conn.prepareStatement("delete from sanpham where id_sp = ?");
            
            pr.setString(1, getmsp1.getText());
            
            pr.executeUpdate();
            
            noticlear ncl = new noticlear();
            ncl.setVisible(true);
                        
            refreshkh();
            loaddatasp();
            pr.close();
            conn.close();
                     
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_delsp1ActionPerformed

    private void updatesp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatesp1ActionPerformed
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        if (getprice1.getText().equals("") || getsl1.getText().equals("")) {
            notisl canhbao = new notisl();
            canhbao.setVisible(true);
         
        }
        
        else {
            int sl = Integer.parseInt(getprice1.getText());
            int gia = Integer.parseInt(getsl1.getText());
            
            if (sl < 0 || gia < 0 ) {
                notisl canhbao = new notisl();
                canhbao.setVisible(true);
            }
            else {
                try (Connection conn = ds.getConnection()) {
                    PreparedStatement pr = conn.prepareStatement ("update sanpham set price = ?, sl = ?"
                                                                    + "     where id_sp = ?");

                    pr.setString(1, getprice1.getText());
                    pr.setString(2, getsl1.getText());
                    pr.setString(3, getmsp1.getText());

                    pr.executeUpdate();
                    refreshsp();
                    loaddatasp();

                    notiupdate nup = new notiupdate();
                    nup.setVisible(true);

                    pr.close();
                    conn.close();

                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_updatesp1ActionPerformed

    private void sptable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sptable1MouseClicked
        int row = sptable1.getSelectedRow();
        if (row >= 0) {
            getmsp1.setText(sptable1.getValueAt(row, 0).toString());
            getnamesp.setText(sptable1.getValueAt(row, 1).toString());
            getprice1.setText(sptable1.getValueAt(row, 2).toString());
            getsl1.setText(sptable1.getValueAt(row, 3).toString());
            getncc1.setText(sptable1.getValueAt(row, 4).toString());
            getxx1.setText(sptable1.getValueAt(row, 5).toString());
            
        }
    }//GEN-LAST:event_sptable1MouseClicked

    private void clear2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear2MouseClicked
        searchsp.setText("Tìm kiếm");
        refreshsp();
    }//GEN-LAST:event_clear2MouseClicked

    private void searchspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchspMouseClicked
        searchsp.setText("");
    }//GEN-LAST:event_searchspMouseClicked

    private void add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MouseClicked
        AddSP addsp = new AddSP();
        addsp.setVisible(true);
    }//GEN-LAST:event_add2MouseClicked

    private void refreshkh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshkh1MouseClicked
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");       
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS"); 
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()){
            Statement sm = conn.createStatement();           
            ResultSet rskh = sm.executeQuery("select * from sanpham");
            
            model3.setRowCount(0);
            while (rskh.next()) {
               
                Vector row = new Vector ();
                row.add(rskh.getString(1));
                row.add(rskh.getString(2));
                row.add(rskh.getString(3));
                row.add(rskh.getString(4));
                row.add(rskh.getString(5));
                row.add(rskh.getString(6));
               
                model3.addRow(row);                
            }
            model3.fireTableDataChanged();
                
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }//GEN-LAST:event_refreshkh1MouseClicked

    private void iconsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconsearchMouseClicked
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()){
           
            PreparedStatement snv = conn.prepareStatement("select * from nhanvien where id_nv = ?");   
            
            snv.setString(1, searchnv.getText());           
            ResultSet snv1 = snv.executeQuery();
            
            
   
            if(snv1.next()) {
                getmanv1.setText(snv1.getString("id_nv"));
                getname.setText(snv1.getString("name"));
                getns1.setText(snv1.getString("date"));
                getgt1.setText(snv1.getString("gt"));
                getcv1.setText(snv1.getString("chucvu"));
                getdc1.setText(snv1.getString("dc"));
                getsdt1.setText(snv1.getString("sdt"));
            }
            String a = searchnv.getText();
            PreparedStatement ten = conn.prepareStatement("select * from nhanvien where id_nv like '%" + a +"%'");  
            ResultSet ten1 = ten.executeQuery();
            model1.setRowCount(0);
            while (ten1.next()) {
               
                Vector row = new Vector ();
                row.add(ten1.getString(1));
                row.add(ten1.getString(2));
                row.add(ten1.getString(3));
                row.add(ten1.getString(4));
                row.add(ten1.getString(5));
                row.add(ten1.getString(6));
                row.add(ten1.getString(7));
                
                model1.addRow(row);    
            }
            model1.fireTableDataChanged();
            
         
            
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }//GEN-LAST:event_iconsearchMouseClicked

    private void ncctable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ncctable1MouseClicked
        int row = ncctable1.getSelectedRow();
        if (row >= 0) {
            gettenncc.setText(ncctable1.getValueAt(row, 1).toString());
            getidncc.setText(ncctable1.getValueAt(row, 0).toString());
            getsdtncc.setText(ncctable1.getValueAt(row, 3).toString());
            getdcncc.setText(ncctable1.getValueAt(row, 2).toString());
        }
    }//GEN-LAST:event_ncctable1MouseClicked

    private void clear3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear3MouseClicked
        searchncc.setText("Tìm kiếm");
        refreshncc();
    }//GEN-LAST:event_clear3MouseClicked

    private void searchnccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchnccMouseClicked
        searchncc.setText("");
    }//GEN-LAST:event_searchnccMouseClicked

    private void add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseClicked
        AddNCC ancc = new AddNCC();
        ancc.setVisible(true);
    }//GEN-LAST:event_add3MouseClicked

    private void refreshnccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshnccMouseClicked
        loaddatancc();
    }//GEN-LAST:event_refreshnccMouseClicked

    private void extbtn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extbtn5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_extbtn5MouseClicked

    private void deletenccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletenccActionPerformed
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()) {
            PreparedStatement pr = conn.prepareStatement("delete from nhacungcap where id_ncc = ?");
            
            pr.setString(1, getidncc.getText());
            
            pr.executeUpdate();
            
            noticlear ncl = new noticlear();
            ncl.setVisible(true);
                        
            refreshncc();
            loaddatancc();
            pr.close();
            conn.close();
                     
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_deletenccActionPerformed

    private void updatenccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatenccActionPerformed
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
                
        try (Connection conn = ds.getConnection()) {
         
            PreparedStatement upncc = conn.prepareStatement("update nhacungcap set dcncc = ?, sdtncc = ?" 
                                                            + "       where id_ncc = ?");
                    
            upncc.setString(1, getdcncc.getText());
            upncc.setString(2, getsdtncc.getText());
            upncc.setString(3, getidncc.getText());
              
            upncc.executeUpdate();
            notiupdate notiup = new notiupdate();
            notiup.setVisible(true);
            
            refreshncc();
            loaddatancc();
            upncc.close();
            conn.close();      
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }//GEN-LAST:event_updatenccActionPerformed

    private void iconsearch2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconsearch2MouseClicked
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()){
           
            PreparedStatement ssp = conn.prepareStatement("select * from sanpham where id_sp = ?");           
            ssp.setString(1, searchsp.getText());           
            ResultSet ssp1 = ssp.executeQuery();
   
            if(ssp1.next()) {
                getmsp1.setText(ssp1.getString("id_sp"));
                getnamesp.setText(ssp1.getString("tensp"));
                getprice1.setText(ssp1.getString("price"));
                getsl1.setText(ssp1.getString("sl"));
                getncc1.setText(ssp1.getString("nhacungcap"));
                getxx1.setText(ssp1.getString("xuatxu"));
            }
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }//GEN-LAST:event_iconsearch2MouseClicked

    private void iconsearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconsearch1MouseClicked
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()){
           
            PreparedStatement skh = conn.prepareStatement("select * from khachhang where id_kh = ?");           
            skh.setString(1, searchkh.getText());
            ResultSet skh1 = skh.executeQuery();
   
            if(skh1.next()) {
                getidkh1.setText(skh1.getString("id_kh"));
                gethtkh1.setText(skh1.getString("htkh"));           
                getdckh1.setText(skh1.getString("diachikh"));
                getsdtkh1.setText(skh1.getString("sdtkh"));
                
            }
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }//GEN-LAST:event_iconsearch1MouseClicked

    private void iconsearch3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconsearch3MouseClicked
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
        
        try (Connection conn = ds.getConnection()){
           
            PreparedStatement sncc = conn.prepareStatement("select * from nhacungcap where id_ncc = ?");           
            sncc.setString(1, searchncc.getText());
            ResultSet sncc1 = sncc.executeQuery();
   
            if(sncc1.next()) {
                gettenncc.setText(sncc1.getString("tenncc"));
                getidncc.setText(sncc1.getString("id_ncc"));
                getsdtncc.setText(sncc1.getString("sdtncc"));
                getdcncc.setText(sncc1.getString("dcncc"));
                
            }
        }
        catch (Exception e) {
            System.out.println (e);
        }
    }//GEN-LAST:event_iconsearch3MouseClicked

    private void accountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMousePressed
        setMau(account);
        accountpanel.setOpaque(true);
        tablenv1.setVisible(true);
        resetMau(new JPanel[] {khach, sp, nhanvien, npp, logout, doanhthu}, new JPanel [] {khpanel, sppanel, nvpanel,npppanel, loutpanel, dtpanel}); 
        
        leftbanner.setVisible(false);
        taikhoan.setVisible(true);
             
    }//GEN-LAST:event_accountMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(getmonthstart.getText().equals("") || getmonthend.getText().equals("")) {
                notitinh tinh = new notitinh();
                tinh.setVisible(true);
        }
        else {     
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setUser ("sa");
            ds.setPassword ("123456");
            ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
            ds.setPortNumber(1433);
            ds.setDatabaseName("Computer");

            try (Connection conn = ds.getConnection()) {          

                int start = Integer.parseInt(getmonthstart.getText());
                int end = Integer.parseInt(getmonthend.getText());

                if (start > end || end > 12 || start < 1 || end < 1) {
                    notidt dt = new notidt();
                    dt.setVisible(true);                  
                }
                else {
                    PreparedStatement total = conn.prepareStatement("select format(sum(tien),'0,###') as 'Doanh thu' from doanhthu "
                        + "     where month (ngay) >= ? and month (ngay) <= ?");

                    total.setString(1, getmonthstart.getText());
                    total.setString(2, getmonthend.getText());
                    ResultSet rs = total.executeQuery();
                    ResultSetMetaData rsm = rs.getMetaData();

                    int cot = rsm.getColumnCount();

                    while(rs.next()){
                        for (int i = 1; i<= cot; i++){
                            tong.setText(rs.getString(i));
                        }
                    }
                }

                    PreparedStatement hic = conn.prepareStatement("select * from doanhthu "
                            + "         where month(ngay) >= ? and month(ngay) <= ? ");            
                    hic.setString(1, getmonthstart.getText());
                    hic.setString(2, getmonthend.getText());

                    ResultSet rs1 = hic.executeQuery();

                    model4.setRowCount(0);
                    while(rs1.next()) {
                        Vector ncc = new Vector();
                        ncc.add(rs1.getString(1));
                        ncc.add(rs1.getString(2));
                        ncc.add(rs1.getString(3));

                        model4.addRow(ncc);
                    }
                    model4.fireTableDataChanged();

            }


            catch (Exception e) {
                System.out.println (e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void extbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extbtn1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_extbtn1MouseClicked

    private void clear4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear4MouseClicked
        searchtk.setText("Tìm kiếm");
        refreshad();
    }//GEN-LAST:event_clear4MouseClicked

    private void searchtkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchtkMouseClicked
        searchtk.setText("");
    }//GEN-LAST:event_searchtkMouseClicked

    private void iconsearch4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconsearch4MouseClicked
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");

        try (Connection conn = ds.getConnection()) {
            PreparedStatement stkad = conn.prepareStatement("select * from Login where username = ?");
            stkad.setString(1, searchtk.getText());
            ResultSet stkad1 = stkad.executeQuery();
            
            if(stkad1.next()) {
                gettentk.setText(stkad1.getString("username"));
                getpass.setText(stkad1.getString("password"));
            }
            
            PreparedStatement stknv = conn.prepareStatement("select * from AccountNV where username = ?");
            stknv.setString(1, searchtk.getText());
            ResultSet stknv1 = stknv.executeQuery();
            
            if(stknv1.next()){
                gettentk.setText(stknv1.getString("username"));
                getpass.setText(stknv1.getString("pass"));
            }
            
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_iconsearch4MouseClicked

    private void add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add4MouseClicked
        AccountDky acc = new AccountDky();
        acc.setVisible(true);
    }//GEN-LAST:event_add4MouseClicked

    private void refreshtkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshtkMouseClicked
        loaddataaql();
        loaddataanv();
    }//GEN-LAST:event_refreshtkMouseClicked

    private void extbtn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extbtn7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_extbtn7MouseClicked

    private void deletetkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletetkActionPerformed
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
                
        try (Connection conn = ds.getConnection()) {
         
                PreparedStatement delad1 = conn.prepareStatement("delete from Login where username = ?");
                delad1.setString(1, gettentk.getText()); 
                
                PreparedStatement delnv1 = conn.prepareStatement("delete from AccountNV where username = ?");
                delnv1.setString(1, gettentk.getText());         
                               
                delnv1.executeUpdate();
                delad1.executeUpdate();
                
                loaddataaql();
                loaddataanv();
                refreshad();
                
                noticlear ntc = new noticlear();
                ntc.setVisible(true);
        
        }
        catch (Exception e) {
            System.out.println (e);
        }
        
    }//GEN-LAST:event_deletetkActionPerformed
    
    private void uptkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uptkActionPerformed
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser ("sa");
        ds.setPassword ("123456");
        ds.setServerName("LAPTOP-CPS4PJ7N\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Computer");
                
        try (Connection conn = ds.getConnection()) {
         
                PreparedStatement upad1 = conn.prepareStatement("update Login set password = ?"
                                                                     + "     where username = ?");
                upad1.setString(1, getpass.getText());
                upad1.setString(2, gettentk.getText());  
                
                PreparedStatement upnv1 = conn.prepareStatement("update AccountNV set pass = ?"
                                                                     + "     where username = ?");
                upnv1.setString(1, getpass.getText());
                upnv1.setString(2, gettentk.getText());
                
                upad1.executeUpdate();
                upnv1.executeUpdate();
                
                loaddataanv();             
                loaddataaql();
                
                refreshad();
                
                notiupdate nt = new notiupdate();
                nt.setVisible(true);
       

        }
        catch (Exception e) {
            System.out.println (e);
        }
       
    }//GEN-LAST:event_uptkActionPerformed

    private void tablead5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablead5MouseClicked
        int row = tablead5.getSelectedRow();
        if (row >= 0) {
            gettentk.setText(tablead5.getValueAt(row, 0).toString());
            getpass.setText(tablead5.getValueAt(row, 1).toString());      
        }
    }//GEN-LAST:event_tablead5MouseClicked

    private void tablenv1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablenv1MouseClicked
        int row = tablenv1.getSelectedRow();
        if (row >= 0) {
            gettentk.setText(tablenv1.getValueAt(row, 0).toString());
            getpass.setText(tablenv1.getValueAt(row, 1).toString());      
        }
    }//GEN-LAST:event_tablenv1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        loaddatadt();
        tong.setText("");
        getmonthstart.setText("");
        getmonthend.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed
    
        public static void main(String args[]) {

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainUX().setVisible(true);

                }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JPanel accountpanel;
    private javax.swing.JLabel add;
    private javax.swing.JLabel add1;
    private javax.swing.JLabel add2;
    private javax.swing.JLabel add3;
    private javax.swing.JLabel add4;
    private javax.swing.JPanel addkh1;
    private javax.swing.JPanel addkh2;
    private javax.swing.JPanel addkh3;
    private javax.swing.JPanel addnv;
    private javax.swing.JPanel addtk;
    private javax.swing.JPanel bluekh1;
    private javax.swing.JPanel bluencc3;
    private javax.swing.JPanel bluenv;
    private javax.swing.JPanel bluesp3;
    private javax.swing.JPanel bluetk;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel clear1;
    private javax.swing.JLabel clear2;
    private javax.swing.JLabel clear3;
    private javax.swing.JLabel clear4;
    private javax.swing.JLabel dcncc;
    private javax.swing.JButton deletekh1;
    private javax.swing.JButton deletencc;
    private javax.swing.JButton deletenv;
    private javax.swing.JButton deletetk;
    private javax.swing.JButton delsp1;
    private javax.swing.JPanel doanhthu;
    private javax.swing.JScrollPane dt;
    private javax.swing.JPanel dtpanel;
    private javax.swing.JTable dttable;
    private javax.swing.JLabel extbtn;
    private javax.swing.JLabel extbtn1;
    private javax.swing.JLabel extbtn2;
    private javax.swing.JLabel extbtn3;
    private javax.swing.JLabel extbtn5;
    private javax.swing.JLabel extbtn7;
    private javax.swing.JLabel getcv;
    private javax.swing.JTextField getcv1;
    private javax.swing.JLabel getdc;
    private javax.swing.JTextField getdc1;
    private javax.swing.JLabel getdc2;
    private javax.swing.JTextField getdckh1;
    private javax.swing.JTextField getdcncc;
    private javax.swing.JLabel getgt;
    private javax.swing.JTextField getgt1;
    private javax.swing.JTextField gethtkh1;
    private javax.swing.JTextField getidkh1;
    private javax.swing.JTextField getidncc;
    private javax.swing.JLabel getmanv;
    private javax.swing.JTextField getmanv1;
    private javax.swing.JLabel getmanv2;
    private javax.swing.JLabel getmanv3;
    private javax.swing.JLabel getmanv5;
    private javax.swing.JLabel getmasp;
    private javax.swing.JTextField getmonthend;
    private javax.swing.JTextField getmonthstart;
    private javax.swing.JTextField getmsp1;
    private javax.swing.JTextField getname;
    private javax.swing.JTextField getnamesp;
    private javax.swing.JLabel getncc;
    private javax.swing.JTextField getncc1;
    private javax.swing.JLabel getns;
    private javax.swing.JTextField getns1;
    private javax.swing.JTextField getpass;
    private javax.swing.JLabel getprice;
    private javax.swing.JTextField getprice1;
    private javax.swing.JLabel getsdt;
    private javax.swing.JTextField getsdt1;
    private javax.swing.JLabel getsdt2;
    private javax.swing.JTextField getsdtkh1;
    private javax.swing.JTextField getsdtncc;
    private javax.swing.JLabel getsl;
    private javax.swing.JTextField getsl1;
    private javax.swing.JTextField gettenncc;
    private javax.swing.JTextField gettentk;
    private javax.swing.JLabel getxx;
    private javax.swing.JTextField getxx1;
    private javax.swing.JLabel hd1;
    private javax.swing.JLabel hello;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel iconsearch;
    private javax.swing.JLabel iconsearch1;
    private javax.swing.JLabel iconsearch2;
    private javax.swing.JLabel iconsearch3;
    private javax.swing.JLabel iconsearch4;
    private javax.swing.JLabel idncc;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel kh2;
    private javax.swing.JPanel khach;
    private javax.swing.JPanel khpanel;
    private javax.swing.JScrollPane khtable;
    private javax.swing.JTable khtable1;
    private javax.swing.JPanel leftbanner;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel lout1;
    private javax.swing.JPanel loutpanel;
    private javax.swing.JPanel mother;
    private javax.swing.JLabel name1;
    private javax.swing.JScrollPane ncctable;
    private javax.swing.JTable ncctable1;
    private javax.swing.JPanel nhanvien;
    private javax.swing.JPanel npp;
    private javax.swing.JLabel npp1;
    private javax.swing.JLabel npp5;
    private javax.swing.JPanel npppanel;
    private javax.swing.JPanel nvpanel;
    private javax.swing.JScrollPane nvtable;
    private javax.swing.JTable nvtable1;
    private javax.swing.JLabel refreshkh;
    private javax.swing.JLabel refreshkh1;
    private javax.swing.JLabel refreshncc;
    private javax.swing.JLabel refreshtk;
    private javax.swing.JLabel sdtncc;
    private javax.swing.JPanel searchbarkh;
    private javax.swing.JPanel searchbarncc3;
    private javax.swing.JPanel searchbarnv;
    private javax.swing.JPanel searchbarsp1;
    private javax.swing.JPanel searchbartk;
    private javax.swing.JTextField searchkh;
    private javax.swing.JTextField searchncc;
    private javax.swing.JTextField searchnv;
    private javax.swing.JTextField searchsp;
    private javax.swing.JTextField searchtk;
    private javax.swing.JPanel sp;
    private javax.swing.JLabel sp3;
    private javax.swing.JPanel sppanel;
    private javax.swing.JScrollPane sptable;
    private javax.swing.JTable sptable1;
    private javax.swing.JScrollPane tablead4;
    private javax.swing.JTable tablead5;
    private javax.swing.JPanel tabledt;
    private javax.swing.JScrollPane tablenv;
    private javax.swing.JTable tablenv1;
    private javax.swing.JPanel taikhoan;
    private javax.swing.JLabel tenmk;
    private javax.swing.JLabel tennv;
    private javax.swing.JLabel tenql;
    private javax.swing.JLabel tentk1;
    private javax.swing.JTextField tong;
    private javax.swing.JButton updatencc;
    private javax.swing.JButton updatenv;
    private javax.swing.JButton updatenv1;
    private javax.swing.JButton updatesp1;
    private javax.swing.JButton uptk;
    private javax.swing.JPanel userbanner;
    // End of variables declaration//GEN-END:variables
}
