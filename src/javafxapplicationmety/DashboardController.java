/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplicationmety;


import com.github.royken.converter.FrenchNumberToWords;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Paper;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.imageio.ImageIO;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
 * FXML Controller class
 *
 * @author randr
 */
public class DashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button CarBtn;

    @FXML
    private Button ClientBtn;

    @FXML
    private AnchorPane ClientFORM;

    @FXML
    private TableView<clientData> ClientTBV;

    @FXML
    private Button HomeBTN;

    @FXML
    private AnchorPane HomePane;

    @FXML
    private StackPane MAINFORM;

    @FXML
    private Button MINBTNHOME;

    @FXML
    private Button MarketBtn;

    @FXML
    private Label UserName;

    @FXML
    private Button addCliBtn;

    @FXML
    private Button clearCliBtn;

    @FXML
    private Button closeBTNHOME;

    @FXML
    private Button deleteCliBtn;

    @FXML
    private TableColumn<clientData, String> idCli_col;

    @FXML
    private Button logout;

    @FXML
    private AnchorPane main_form;
    
    @FXML
    private AnchorPane CarPane;
    
    
    @FXML
    private AnchorPane CommandPane;
    
    @FXML
    private TextField CommandSearchTextField;

    @FXML
    private TableView<commandData> CommandTBV;
    
    @FXML
    private Button addCommBtn;
    
      @FXML
    private TableColumn<commandData, String> carnumcomm_col;
      
          @FXML
    private Button clearCommBtn;
          
          @FXML
    private TableColumn<commandData, String> clinumcomm_col;
          
          
    @FXML
    private DatePicker dateComm;
    
    
    @FXML
    private TableColumn<commandData, Date> datecomm_col;
    
     @FXML
    private Button deleteCommBtn;
     
       @FXML
    private TableColumn<commandData, Integer> idcomm_col;
       
       
    @FXML
    private ComboBox<String> numCarCommCB;
    
    @FXML
    private ComboBox<String> numCliCommCB;
    
    @FXML
    private TextField numCommTextFIeld;
    
    @FXML
    private TableColumn<commandData, String> numcomm_col;
    
    @FXML
    private TextField qteCommTextField;

    @FXML
    private TableColumn<commandData, Integer> qtecomm_col;
    
    

    @FXML
    private TextField nameCliTextField;

    @FXML
    private TableColumn<clientData, String> nameClient_col;

    @FXML
    private TextField numberCliTextField;

    @FXML
    private TableColumn<clientData, String> numberCli_col;

    @FXML
    private Button searchCliBtn;

    @FXML
    private TextField searchClientTextField;

    @FXML
    private Button updateCliBtn;
    @FXML
    private TableView<carData> CarTBV;

    @FXML
    private Button ClearCarBtn;
    
    @FXML
    private Button DeleteCarBtn;
    
    @FXML
    private Button UpdateCarBtn;
    
    @FXML
    private TextField designCarTextField;

    @FXML
    private TableColumn<carData, String> designcar_col;

    @FXML
    private TextField numberCarTextField;
    
    @FXML
    private TableColumn<carData, String> numcar_col;
    
    @FXML
    private TextField stockCarTextField;

    @FXML
    private TableColumn<carData, Integer> stockcar_col;

    @FXML
    private TextField unitPriceTCarextField;

    @FXML
    private TableColumn<carData, Integer> idcar_col;
    @FXML
    private TableColumn<carData, Integer> pu_col;
    
    @FXML
    private TextField carSearchTextField;
   
     @FXML
    private Button updateCommBtn;
     //CARSCOMMAND LIST
     @FXML
    private Button carsCommandedBtn;
     
     @FXML
     private AnchorPane carsCommandedPane;
     
     @FXML
     
     private DatePicker dateFrom;
     @FXML
     
     private DatePicker dateTo;
     
      @FXML
    private TableView<Car2Date> Car2dateTBV;
      
      @FXML
    private TableColumn<Car2Date, String> carName_col;
      
      @FXML
    private TableColumn<Car2Date, String> clientName_col;
      
       @FXML
    private TableColumn<Car2Date, String> numberCommand_col;
       
        @FXML
    private TableColumn<Car2Date, Integer> quantity_col;
        
        @FXML
    private Button serchCarsBtn;
        
        @FXML
    private TableColumn<Car2Date, Date> dateCommande_col;
        
        @FXML
        private Label totalCar2Date;
        
        //listOfCAR PANE
        
        @FXML
        private AnchorPane listOfCarPane;
        
        @FXML
        private ComboBox<String> carNameCB;
        
        @FXML
        private DatePicker dateFromCar;
        
        @FXML
        private DatePicker dateToCar;
        
        @FXML
        private Button listOfCarBtn;
        @FXML
        private Button listOfCarBtnSearch;
        
        @FXML
        private TableView<listOfCarData> listOfCarTBV;
        
        @FXML
        private TableColumn<listOfCarData, String> carNumber_col;
        
        @FXML
        private TableColumn<listOfCarData, String> clientNameCar_col;
        
        @FXML
        private TableColumn<listOfCarData, Integer> qteCar_col;
        
        @FXML
        private TableColumn<listOfCarData, Date> dateCar_col;
        
        @FXML
        private TableColumn<listOfCarData, String> tttt_col;
        
        @FXML
        private Label totalCarLabel;
        
        @FXML
        private Label totalStockLabel;
        
        //SF
        @FXML
        private AnchorPane SFPANE;
        
        @FXML
        private Button SFTBTN;
        
        @FXML
        private ComboBox<String> clientNameCB;
        
        @FXML
        private DatePicker dateFromCli;
        
        @FXML
        private DatePicker dateToCli;
        
        @FXML
        private Button printCliBtn;
        
        @FXML
        private TableView<SFData> SFTBV;

        @FXML
        private  TableColumn<SFData, String> clientSF_col;
        @FXML
        private  TableColumn<SFData, String> carSF_col;
        @FXML
        private  TableColumn<SFData, Integer> qteSF_col;
        @FXML
        private  TableColumn<SFData, String> commSF_col;
        @FXML
        private  TableColumn<SFData, Date> dateSF_col;
        @FXML
        private Label SFTotale;
        @FXML
        private Label totl;
        @FXML
        private Label totaCArLAbel;
        
        //INVOICE
        @FXML
        private Button invoiceBTN;
        
        @FXML
        private AnchorPane invoicePANE;
        @FXML
        private
                AnchorPane 
        invoicePrint;
        
        @FXML
        private ComboBox <String> clientBill;
        
        @FXML
        private TextField billN;
        
        @FXML
        private DatePicker dateBill;
        
        @FXML
        private Button showBillBtn;
        @FXML
        private Button printBillBtn;
        
        
        @FXML
        private Label billLabel;
        @FXML
        private Label dateLabel;
        @FXML
        private Label clientLabel;
        @FXML
        private Label numberLabel;
        @FXML
        private Label convertedLabel;
        
        @FXML 
        private TableView<invoiceData> invoiceTBV;
        
        @FXML 
        private TableColumn<invoiceData, String>  clientInvoice_col;
        @FXML 
        private TableColumn<invoiceData, String>  carInvoice_col;
        @FXML 
        private TableColumn<invoiceData, Integer>  upInvoice_col;
        @FXML 
        private TableColumn<invoiceData, Integer>  qteInvoice_col;
        @FXML 
        private TableColumn<invoiceData, Integer>  amount_col;
        
        @FXML
        private BarChart<?, ?> barChar;
        @FXML
    private PieChart pieChart;
        
        
        
    
    
     //CONN LIST
    private Connection connect;
    private Statement statement;
    private PreparedStatement prepare;
    private  ResultSet result;
    
    public void PieChart()
    {
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        String chartSql = "SELECT SUM(commande.quantity), voiture.design FROM commande JOIN voiture ON(commande.idvoiture=voiture.id) GROUP BY voiture.design  ORDER BY voiture.design ASC";
        try{
            prepare = connect.prepareStatement(chartSql);
            result = prepare.executeQuery();
            while(result.next())
            {
                ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
               new PieChart.Data(result.getString(2), result.getInt(1))
            );  
//                pieChart.setTitle("Products Sold");
//            pieChart.setClockwise(true);
//            pieChart.setLabelLineLength(50);
//            pieChart.setLabelsVisible(true); 
//            pieChart.setStartAngle(180);
            pieChart.setData(pieChartData);
            }
            
            
         
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    /*public void chart()
    {
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        String chartSql = "SELECT commande.date, SUM(commande.quantity*voiture.pu) FROM commande JOIN voiture ON(commande.idvoiture=voiture.id) GROUP BY commande.date ORDER BY commande.date ASC LIMIT 8";
        
        try{
            XYChart.Series chartData = new XYChart.Series();
            
            prepare = connect.prepareStatement(chartSql);
            result = prepare.executeQuery();
            
            while(result.next())
            {
                chartData.getData().add(new XYChart.Data(result.getString(1), result.getInt(2)));
                
            }
            barChar.getData().add(chartData);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }*/
    public void updateChart() {
    // Clear existing data from the chart
    barChar.getData().clear();

    // Retrieve the latest data from the database and update the chart
    // ... Your code to fetch the latest data and update the chart goes here ...
    chartFinal();
}

    public void chartFinal()
    {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Product");
        
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Quantity Sold");
        
   
        
        XYChart.Series data = new XYChart.Series();
        data.setName("Products sold");
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        String chartSql = "SELECT SUM(commande.quantity), voiture.design FROM commande JOIN voiture ON(commande.idvoiture=voiture.id) GROUP BY voiture.design  ORDER BY voiture.design ASC";
        barChar.getXAxis().setLabel("Product");
        barChar.getYAxis().setLabel("Quantity Sold");
                try{
            
     
            prepare = connect.prepareStatement(chartSql);
            result = prepare.executeQuery();
            
            while(result.next())
            {
                data.getData().add(new XYChart.Data(result.getString(2), result.getInt(1)));
                
            }
            barChar.getData().add(data);
            barChar.setLegendVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
    
    public void printInvoiceToPDF() {
        // Create a writable image to capture the content of the AnchorPane
        WritableImage snapshot = invoicePrint.snapshot(new SnapshotParameters(), null);

        // Specify the output file path for the PDF
        String filePath = "C:/invoiceTse.pdf";

        try {
            // Convert the snapshot image to a BufferedImage
            java.awt.image.BufferedImage image = SwingFXUtils.fromFXImage(snapshot, null);

            try ( // Create a new PDF document
                    PDDocument document = new PDDocument()) {
                PDPage page = new PDPage();
                document.addPage(page);
                // Create a PDPageContentStream for writing to the PDF document
                PDPageContentStream contentStream = new PDPageContentStream(document, page);
              
                // Write the image to the PDF document
                File tempFile = File.createTempFile("snapshot", ".png");
                ImageIO.write(image, "png", tempFile);
                PDImageXObject pdImage = PDImageXObject.createFromFile(tempFile.getAbsolutePath(), document);
                 float pageWidth = page.getMediaBox().getWidth();
                float pageHeight = page.getMediaBox().getHeight();
                float imageWidth = pdImage.getWidth();
                float imageHeight = pdImage.getHeight();
                 float x = (pageWidth - imageWidth) / 2; // Center the image horizontally
                 float y = pageHeight - imageHeight; // Position the image at the top
               // Set the DPI to 300 for higher image quality
            contentStream.drawImage(pdImage, x, y, imageWidth, imageHeight);
                
                // Close the content stream
                contentStream.close();
                
                // Save the PDF document
                document.save(filePath);
            }

            System.out.println("Invoice saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    //PRINT
    public void PrintInvoice()
    {
      try{
         printInvoiceToPDF();     }
      catch(Exception e)
      {
          e.printStackTrace();
      }

    }
    
    //LIST
    public ObservableList<invoiceData> invoiceListData()
            
    {
    ObservableList<invoiceData> invoicedata = FXCollections.observableArrayList();
        String nameCli = clientBill.getSelectionModel().getSelectedItem();
        String sql = "SELECT client.number, voiture.design, numerocommande, voiture.pu, commande.quantity, (commande.quantity*voiture.pu) from commande JOIN client ON(commande.idclient=client.id) JOIN voiture ON (commande.idvoiture=voiture.id) WHERE client.name = '"+nameCli+"' ORDER by commande.id";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try
        {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            invoiceData invoiceD;
            while(result.next())
            {   
                invoiceD = new invoiceData(result.getString(1), result.getString(2), result.getString(3), result.getInt(4), result.getInt(5), result.getInt(6));
                invoicedata.add(invoiceD);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return invoicedata;
    }
    private ObservableList<invoiceData> InvoiceList;
    
    //SEPARATOR
    public class Separator extends TableCell<invoiceData, Integer> {
    private static final DecimalFormat formatter = new DecimalFormat("#,###");

    @Override
    protected void updateItem(Integer item, boolean empty) {
        super.updateItem(item, empty);
        if (empty || item == null) {
            setText(null);
        } else {
            setText(formatter.format(item));
        }
    }
}
    public void ShowInvoiceList()
    {
        InvoiceList = invoiceListData();
        
        clientInvoice_col.setCellValueFactory(new PropertyValueFactory<>("client"));
        carInvoice_col.setCellValueFactory(new PropertyValueFactory<>("car"));
        upInvoice_col.setCellValueFactory(new PropertyValueFactory<>("up"));
        upInvoice_col.setCellFactory(column -> new Separator());
        qteInvoice_col.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        amount_col.setCellValueFactory(new PropertyValueFactory<>("amount"));
        amount_col.setCellFactory(column -> new Separator());
        invoiceTBV.setItems(InvoiceList);
    }
    
    //BILLING DATA
    public void ShowBTn()
    {   convertedLabel.setText("");
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        String clientNumber = null;
        String nameCli = clientBill.getSelectionModel().getSelectedItem();
        Integer totale = 0;
        String somme = null;
        String sql = "SELECT number from client where name = '"+nameCli+"'";
        String sqlS = "SELECT SUM(commande.quantity*voiture.pu) FROM commande JOIN voiture ON(voiture.id=commande.idvoiture) JOIN client ON(client.id=commande.idclient) WHERE client.name = '"+nameCli+"'";
        String InvoiceN = billN.getText();
        DatePicker datePicker = new DatePicker();
        datePicker.setValue(dateBill.getValue());
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedValue = (dateBill.getValue()).format(dateFormatter);
                dateBill.setValue(LocalDate.parse(formattedValue,dateFormatter));
                java.util.Date date1 = java.util.Date.from(dateBill.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
                try
        {
            Statement stmt = connect.createStatement();
            result = stmt.executeQuery(sql);
            while(result.next())
            {
              clientNumber = result.getString(1);
            }
            Statement smt = connect.createStatement();
            result = smt.executeQuery(sqlS);
            while(result.next())
            {
              totale = result.getInt(1);
              somme = (FrenchNumberToWords.convert(totale).toUpperCase());
            }
               billLabel.setText(String.valueOf(InvoiceN));
         clientLabel.setText(String.valueOf(nameCli));
         numberLabel.setText(String.valueOf(clientNumber));
         dateLabel.setText(String.valueOf(sqlDate1));
         convertedLabel.setText(String.valueOf(somme));
        ShowInvoiceList();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
                
      
        
        
    }
    //SALEFIGURE
    //CB SET
    
    public void ClientName()
    {
        String sql = "SELECT name from client";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        ArrayList<String> client = new ArrayList();
        try
        {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
              client.add(rs.getString("name"));
            }
            ObservableList listData = FXCollections.observableArrayList(client);
            clientNameCB.setItems(listData);
            clientBill.setItems(listData);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    //LIST
    
    public ObservableList<SFData> SFListData()
    {
    ObservableList<SFData> sflistdata = FXCollections.observableArrayList();
    
    //CARNAME CB
    String clientName = clientNameCB.getSelectionModel().getSelectedItem();
    Integer CAI;
    Integer CATotale = 0;
    Integer totCarF = 0;
    //DATE FROM
        DatePicker datePicker1 = new DatePicker();
        datePicker1.setValue(dateFromCli.getValue());
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedValue = (dateFromCli.getValue()).format(dateFormatter);
                dateFromCli.setValue(LocalDate.parse(formattedValue,dateFormatter));
                java.util.Date date1 = java.util.Date.from(dateFromCli.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
                //DATE TO
        DatePicker datePicker= new DatePicker();
        datePicker.setValue(dateToCli.getValue());
                String formattedValue1 = (dateToCli.getValue()).format(dateFormatter);
                dateToCli.setValue(LocalDate.parse(formattedValue1,dateFormatter));
                java.util.Date date = java.util.Date.from(dateToCli.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        String sql = "SELECT client.number, voiture.number, commande.quantity,  commande.numerocommande,  commande.date, SUM(commande.quantity*voiture.pu), COUNT(DISTINCT(voiture.design)) as NbVoiture from commande JOIN client ON(commande.idclient=client.id) JOIN voiture ON (commande.idvoiture=voiture.id) WHERE client.name = '"+clientName+"' AND commande.date BETWEEN '"+sqlDate1+"' AND '"+sqlDate+"' GROUP BY voiture.number, client.number, commande.numerocommande, commande.quantity, commande.date" ;
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try
        {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            SFData SF;
            int i = 0;
            while(result.next())
            {
                CAI = result.getInt(6);
                totCarF = result.getInt("NbVoiture");
                SF = new SFData(result.getString(1), result.getString(2), result.getInt(3), result.getString(4),  result.getDate(5));
                sflistdata.add(SF);
                CATotale = CATotale + CAI;
                i++;  
            }
            DecimalFormat formatter = new DecimalFormat("#,###");
            SFTotale.setText(formatter.format(CATotale));
            totl.setText(String.valueOf(i));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return sflistdata;
    }
    
    private ObservableList<SFData> sflist;
    public void SFList()
    {
        sflist = SFListData();
        clientSF_col.setCellValueFactory(new PropertyValueFactory<>("clientnumber"));
        carSF_col.setCellValueFactory(new PropertyValueFactory<>("carname"));
        qteSF_col.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        commSF_col.setCellValueFactory(new PropertyValueFactory<>("command"));
        dateSF_col.setCellValueFactory(new PropertyValueFactory<>("date"));
        SFTBV.setItems(sflist);
    }
    
    public void SFBtn()
            
    {
        SFList();
    }

    //LISTOFCAR
    
    //CB SET
    public void CarName()
    {
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        ArrayList<String> car = new ArrayList();
        try
        {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select design from voiture");
            while(rs.next())
            {
              car.add(rs.getString("design"));
            }
            ObservableList listData = FXCollections.observableArrayList(car);
            carNameCB.setItems(listData);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
  
    
    private ObservableList<listOfCarData> carList;
    public void carList()
    {
        carList = ListOfCarData();
        carNumber_col.setCellValueFactory(new PropertyValueFactory<>("CarNumber"));
        clientNameCar_col.setCellValueFactory(new PropertyValueFactory<>("ClientName"));
        qteCar_col.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        tttt_col.setCellValueFactory(new PropertyValueFactory<>("command"));
        dateCar_col.setCellValueFactory(new PropertyValueFactory<>("date"));
        listOfCarTBV.setItems(carList);
    }
    
//    LISTTABLE
    public ObservableList<listOfCarData> ListOfCarData()
    {
    ObservableList<listOfCarData> listofcardata = FXCollections.observableArrayList();
    
    //CARNAME CB
    String carName = carNameCB.getSelectionModel().getSelectedItem();
    Integer stockI;
    Integer stockTotale = 0;
    //DATE FROM
        DatePicker datePicker1 = new DatePicker();
        datePicker1.setValue(dateFromCar.getValue());
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedValue = (dateFromCar.getValue()).format(dateFormatter);
                dateFromCar.setValue(LocalDate.parse(formattedValue,dateFormatter));
                java.util.Date date1 = java.util.Date.from(dateFromCar.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
                //DATE TO
        DatePicker datePicker= new DatePicker();
        datePicker.setValue(dateToCar.getValue());
                String formattedValue1 = (dateToCar.getValue()).format(dateFormatter);
                dateToCar.setValue(LocalDate.parse(formattedValue1,dateFormatter));
                java.util.Date date = java.util.Date.from(dateToCar.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        String sql = "SELECT voiture.number, client.name, commande.numerocommande, commande.quantity, commande.date, SUM(quantity) from commande JOIN client ON(commande.idclient=client.id) JOIN voiture ON (commande.idvoiture=voiture.id) WHERE voiture.design = '"+carName+"' AND commande.date BETWEEN '"+sqlDate1+"' AND '"+sqlDate+"' GROUP BY voiture.number, client.name, commande.numerocommande, commande.quantity, commande.date" ;
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try
        {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            listOfCarData listOf;
            int i = 0;
            while(result.next())
            {
                stockI = result.getInt(6);
                listOf = new listOfCarData(result.getString(1), result.getString(2), result.getString(3), result.getInt(4),  result.getDate(5));
                listofcardata.add(listOf);
                stockTotale = stockTotale + stockI;
                i++;  
            }
            totalCarLabel.setText(String.valueOf(i));
            totalStockLabel.setText(String.valueOf(stockTotale));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return listofcardata;
    }
    
    
    
    //SEARCHBTN
    public void SearchListOfCar()
    {
        carList();
    }
    
    
    
    //CAR2DATE
    public void TotalCar2Date()
    {   
    
        DatePicker datePicker1 = new DatePicker();
        datePicker1.setValue(dateFrom.getValue());
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedValue = (dateFrom.getValue()).format(dateFormatter);
                dateFrom.setValue(LocalDate.parse(formattedValue,dateFormatter));
                java.util.Date date1 = java.util.Date.from(dateFrom.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
                //DATE TO
        DatePicker datePicker= new DatePicker();
        datePicker.setValue(dateTo.getValue());
                String formattedValue1 = (dateTo.getValue()).format(dateFormatter);
                dateTo.setValue(LocalDate.parse(formattedValue1,dateFormatter));
                java.util.Date date = java.util.Date.from(dateTo.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        String sql = "SELECT COUNT(id) FROM voiture JOIN commande ON(commande.idvoiture=voiture.id) WHERE  commande.date BETWEEN '"+sqlDate1+"' AND '"+sqlDate+"'";
        int countData = 0;
        try
        {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            while(result.next())
            {
                countData = result.getInt("COUNT(id)");

            }
            totalCar2Date.setText(String.valueOf(countData));
         
            
        }
        catch(Exception e)
        {}
    }
    
    public void Searh2DateCars()
    {
        Alert alert;
//        TotalCar2Date();
        if(dateFrom.getEditor().getText().isEmpty() || dateTo.getEditor().getText().isEmpty())
        {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please select a date !");
            alert.showAndWait();
        }
        else{
        showCar2DateList();
        }
    }
    
    public ObservableList<Car2Date> Cars2DateListData()
    {
    ObservableList<Car2Date> car2dateListdata = FXCollections.observableArrayList();
    //DATE FROM
        DatePicker datePicker1 = new DatePicker();
        datePicker1.setValue(dateFrom.getValue());
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedValue = (dateFrom.getValue()).format(dateFormatter);
                dateFrom.setValue(LocalDate.parse(formattedValue,dateFormatter));
                java.util.Date date1 = java.util.Date.from(dateFrom.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
                //DATE TO
        DatePicker datePicker= new DatePicker();
        datePicker.setValue(dateTo.getValue());
                String formattedValue1 = (dateTo.getValue()).format(dateFormatter);
                dateTo.setValue(LocalDate.parse(formattedValue1,dateFormatter));
                java.util.Date date = java.util.Date.from(dateTo.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        String sql = "SELECT COUNT(commande.idvoiture) as totaleCar, voiture.design, client.name, commande.numerocommande, commande.quantity, commande.date from commande JOIN client ON(commande.idclient=client.id) JOIN voiture ON (commande.idvoiture=voiture.id) WHERE commande.date BETWEEN '"+sqlDate1+"' AND '"+sqlDate+"' GROUP BY voiture.design, client.name, commande.numerocommande, commande.quantity, commande.date, commande.id" ;
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try
        {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Car2Date car2date;
            int i = 0;
            while(result.next())
            {   
                car2date = new Car2Date(result.getString(2), result.getString(3), result.getString(4), result.getInt(5),  result.getDate(6), result.getInt(1));
                car2dateListdata.add(car2date);
                i++;  
            }
            totalCar2Date.setText(String.valueOf(i));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return car2dateListdata;
    }
    private ObservableList<Car2Date> Car2dateList;
    public void showCar2DateList()
    {
        Car2dateList = Cars2DateListData();
        carName_col.setCellValueFactory(new PropertyValueFactory<>("car"));
        clientName_col.setCellValueFactory(new PropertyValueFactory<>("client"));
        quantity_col.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        numberCommand_col.setCellValueFactory(new PropertyValueFactory<>("number"));
        dateCommande_col.setCellValueFactory(new PropertyValueFactory<>("date"));
        Car2dateTBV.setItems(Car2dateList);
    }
  
    
    

    public void displayUsername()
    {
        UserName.setText(getData.username.toUpperCase());
    }
    
    public void ClientSearch()
    {
        String searchText = searchClientTextField.getText().toLowerCase().trim();

    // Create a filtered list based on the search input
    FilteredList<clientData> filteredList = new FilteredList<>(addClientList);
    filteredList.setPredicate(clientData -> {
        // Customize the search logic based on your requirements
        return clientData.getName().toLowerCase().contains(searchText)
                || clientData.getNumber().toLowerCase().contains(searchText);
    });

    // Wrap the filtered list in a SortedList for sorting if needed
    SortedList<clientData> sortedList = new SortedList<>(filteredList);
    sortedList.comparatorProperty().bind(ClientTBV.comparatorProperty());

    // Update the table with the filtered and sorted data
    ClientTBV.setItems(sortedList);
    }
    
    public void CarSearch() {
    String searchText = carSearchTextField.getText().toLowerCase().trim();
    
    // Create a filtered list based on the search input
    FilteredList<carData> filteredList = new FilteredList<>(CarList);
    filteredList.setPredicate(carData -> {
        // Customize the search logic based on your requirements
        return carData.getDesign().toLowerCase().contains(searchText)
                || carData.getNumber().toLowerCase().contains(searchText);
    });

    // Wrap the filtered list in a SortedList for sorting if needed
    SortedList<carData> sortedList = new SortedList<>(filteredList);
    sortedList.comparatorProperty().bind(CarTBV.comparatorProperty());

    // Update the table with the filtered and sorted data
    CarTBV.setItems(sortedList);
}
    
    public void CommandSearch() {
    String searchText = CommandSearchTextField.getText().toLowerCase().trim();

    // Create a filtered list based on the search input
    FilteredList<commandData> filteredList = new FilteredList<>(CommandList);
    filteredList.setPredicate(commandData -> {
        // Customize the search logic based on your requirements
        return commandData.getNumber().toLowerCase().contains(searchText);
    });

    // Wrap the filtered list in a SortedList for sorting if needed
    SortedList<commandData> sortedList = new SortedList<>(filteredList);
    sortedList.comparatorProperty().bind(CommandTBV.comparatorProperty());

    // Update the table with the filtered and sorted data
    CommandTBV.setItems(sortedList);
}

    
    
    public ObservableList<commandData> CommandListData()
            
    {
    ObservableList<commandData> commandListData = FXCollections.observableArrayList();
        String sql = "SELECT commande.id, client.number, voiture.number, numerocommande, commande.quantity, commande.date from commande JOIN client ON(commande.idclient=client.id) JOIN voiture ON (commande.idvoiture=voiture.id) ORDER by commande.id";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try
        {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            commandData commandD;
            while(result.next())
            {   
                commandD = new commandData(result.getInt(1), result.getString(4), result.getString(2), result.getString(3), result.getInt(5), result.getDate(6));
                commandListData.add(commandD);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return commandListData;
    }
    private ObservableList<commandData> CommandList;
    public void showCommandList()
    {
        CommandList = CommandListData();
        
        idcomm_col.setCellValueFactory(new PropertyValueFactory<>("id"));
        carnumcomm_col.setCellValueFactory(new PropertyValueFactory<>("CarId"));
        clinumcomm_col.setCellValueFactory(new PropertyValueFactory<>("ClientId"));
        qtecomm_col.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        datecomm_col.setCellValueFactory(new PropertyValueFactory<>("date"));
        numcomm_col.setCellValueFactory(new PropertyValueFactory<>("number"));
        CommandTBV.setItems(CommandList);
    }
    
    public void SelectCommandTBV()
    {
        String data1 = (String) clinumcomm_col.getCellObservableValue(1).getValue();
        ObservableValue observableValue = clinumcomm_col.getCellObservableValue(3);
        
        commandData commandD = CommandTBV.getSelectionModel().getSelectedItem();
        int num = CommandTBV.getSelectionModel().getSelectedIndex();
        if((num -1)< -1)
        {return;}
        String CarId = String.valueOf(commandD.getCarId());
        String ClientId = String.valueOf(commandD.getClientId());
//        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
//        connect = dbc.getConnection();
//        
        numCommTextFIeld.setText(String.valueOf(commandD.getNumber()));
        numCarCommCB.setPromptText(CarId);
        numCliCommCB.setPromptText(ClientId);
        qteCommTextField.setText(String.valueOf(commandD.getQuantity()));
       dateComm.getEditor().setText(String.valueOf(commandD.getDate()));
       
    }
    
    
    
    
    
    public ObservableList<carData> CarListData()
            {
            ObservableList<carData> carListData = FXCollections.observableArrayList();
        String sql = "SELECT * from voiture";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try
        {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            carData cardata;
            while(result.next())
            {
                cardata = new carData(result.getInt("id"), result.getString("number"), result.getString("design"), result.getInt("pu"), result.getInt("stock"));
                carListData.add(cardata);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return carListData;
            }
     private ObservableList<carData> CarList;
     
     //SEPARATOR
    public class PriceTableCell extends TableCell<carData, Integer> {
    private static final DecimalFormat formatter = new DecimalFormat("#,###");

    @Override
    protected void updateItem(Integer item, boolean empty) {
        super.updateItem(item, empty);
        if (empty || item == null) {
            setText(null);
        } else {
            setText(formatter.format(item));
        }
    }
}
     public void showCarList()
    {
        CarList = CarListData();
        
        idcar_col.setCellValueFactory(new PropertyValueFactory<>("id"));
        numcar_col.setCellValueFactory(new PropertyValueFactory<>("number"));
        designcar_col.setCellValueFactory(new PropertyValueFactory<>("design"));
        pu_col.setCellValueFactory(new PropertyValueFactory<>("pu"));
        pu_col.setCellFactory(column -> new PriceTableCell());
        stockcar_col.setCellValueFactory(new PropertyValueFactory<>("stock"));
        
        CarTBV.setItems(CarList);
    }
    
   
  
    public ObservableList<clientData> addClientListData() 
    {
        ObservableList<clientData> listData = FXCollections.observableArrayList();
        String sql = "SELECT * from client";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try
        {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            clientData clientD;
            while(result.next())
            {
                clientD = new clientData(result.getInt("id"), result.getString("number"), result.getString("name"));
                listData.add(clientD);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return listData;
    }
    
    private ObservableList<clientData> addClientList;
    public void addClientShowListData()
    {
        addClientList = addClientListData();
        
        idCli_col.setCellValueFactory(new PropertyValueFactory<>("id"));
        numberCli_col.setCellValueFactory(new PropertyValueFactory<>("number"));
        nameClient_col.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        ClientTBV.setItems(addClientList);
    }
    
    public void carSelectTBV(){
        carData carD = CarTBV.getSelectionModel().getSelectedItem();
        int num = CarTBV.getSelectionModel().getSelectedIndex();
        if((num -1)< -1)
        {return;}
        numberCarTextField.setText(String.valueOf(carD.getNumber()));
        unitPriceTCarextField.setText(String.valueOf(carD.getPu()));
        stockCarTextField.setText(String.valueOf(carD.getStock()));
        designCarTextField.setText(String.valueOf(carD.getDesign()));
    }
    
    public void addClientSelect()
            
    {
        clientData clientD = ClientTBV.getSelectionModel().getSelectedItem();
        int num = ClientTBV.getSelectionModel().getSelectedIndex();
        if((num -1)< -1)
        {return;}
        String i = String.valueOf(clientD.getId());
        System.out.println(i);
        numberCliTextField.setText(String.valueOf(clientD.getNumber()));
        nameCliTextField.setText(String.valueOf(clientD.getName()));
        
    }
    
    public void CommandClear()
    {
        numCommTextFIeld.setText("");
        numCarCommCB.setValue("");
        numCliCommCB.setValue("");
        qteCommTextField.setText("");
        dateComm.getEditor().setText("");
    }
    
    public void UpdateCommand()
    {
        commandData commandD = CommandTBV.getSelectionModel().getSelectedItem();
        String i = String.valueOf(commandD.getId());
        DatePicker datePicker = new DatePicker();
        Integer ClientId = 0;
        Integer CarId = 0;
        Integer StockCar = 0;
        Integer qteCommande = 0;
                datePicker.setValue(dateComm.getValue());
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedValue = (dateComm.getValue()).format(dateFormatter);
                dateComm.setValue(LocalDate.parse(formattedValue,dateFormatter));
                java.util.Date date = java.util.Date.from(dateComm.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try{
            Alert alert;
            if(numCommTextFIeld.getText().isEmpty() || qteCommTextField.getText().isEmpty() || dateComm.getEditor().getText().isEmpty())
            {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("There is no data to update !");
            alert.showAndWait();
            }
            else{
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to udapte command : "+i+" ? ");
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK))
                {
                    int qte = Integer.parseInt((String)qteCommTextField.getText());
            //CLIENTId
            String numCli = (String)numCliCommCB.getSelectionModel().getSelectedItem();
            String sqlC = "SELECT id from client where number = '"+numCli+"'   ";
            Statement smtCli = connect.createStatement();
            ResultSet rsIdCli = smtCli.executeQuery(sqlC);
            while(rsIdCli.next())
            {
                 ClientId = rsIdCli.getInt("id");      
            }
            //CARId
            String numVoi = (String)numCarCommCB.getSelectionModel().getSelectedItem();
            Statement smtVoiture = connect.createStatement();
            String queryVoiture = "select id, stock from voiture where number = '"+numVoi+"' ";
            ResultSet rsIdVoiture = smtVoiture.executeQuery(queryVoiture);
            if(rsIdVoiture.next())
            {
                CarId = Integer.valueOf(rsIdVoiture.getString("id"));
                StockCar = rsIdVoiture.getInt("stock");
            }  
            //QTE COMMANDE
            String numComm = numCommTextFIeld.getText();
            Statement qteComm = connect.createStatement();
            String sqlComm = "SELECT quantity from commande WHERE numerocommande = '"+numComm+"'";
            ResultSet qteC = qteComm.executeQuery(sqlComm);
            if(qteC.next())
            {
                qteCommande = qteC.getInt("quantity");
            } 
            
            if(StockCar<qte)
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Insuffisant Stock !");
                alert.showAndWait();
            }
            else{
                
                //STOCK MOUVEMENT
                int totale_stock = ((StockCar-qte)+qteCommande);
                String update_STOCK = "update voiture set stock = '"+totale_stock+"' where id = "+CarId;
                    
                    String sql = "UPDATE commande SET numerocommande = '"+numCommTextFIeld.getText()+"', idclient = '"+ClientId+"', idvoiture = '"+CarId+"', quantity = '"+qteCommTextField.getText()+"', date = '"+sqlDate+"' where id = '"+i+"'";
                statement = connect.createStatement();
                statement.executeUpdate(sql);
                statement.executeUpdate(update_STOCK);
                
                alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Command updated successfully !");
            alert.showAndWait();
            
            CommandClear();
            showCommandList();
            showCarList();
            NumClientCB();
            NumCarCB();
            updateChart();
            }
                }
                
            }
            
        }
     catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    
    public void DeleteCommand()
    {
        String sql = "DELETE FROM commande where numerocommande = '"+numCommTextFIeld.getText()+"'";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        Integer CarId = null;
        Integer StockVoitureMinus = null;
        try
        {
            Alert alert; 
            if(numCommTextFIeld.getText().isEmpty() || qteCommTextField.getText().isEmpty() || dateComm.getEditor().getText().isEmpty())
            {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("There is no command to delete !");
            alert.showAndWait();
            }
            else
            {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to delete command number : "+numCommTextFIeld.getText()+" ?");
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK))
                {
                    //STOCK MOUVEMENT
            String numVoi = (String)numCarCommCB.getSelectionModel().getSelectedItem();
            statement = connect.createStatement();
            String queryVoiture = "SELECT id, stock FROM voiture where number = '"+numVoi+"' ";
            result = statement.executeQuery(queryVoiture);
            while(result.next())
            {
                CarId =result.getInt("id");
                StockVoitureMinus = result.getInt("stock");
             
            }
            
                    int qte = Integer.parseInt(qteCommTextField.getText());
                    int totale_stockMinus= (qte+StockVoitureMinus);
                        String etat_stock_minus = "update voiture set stock = '"+totale_stockMinus+"' where id = "+CarId;
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    statement.execute(etat_stock_minus);
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Command Deleted Successfully !");
                    alert.showAndWait();
                    
                    CommandClear();
            showCommandList();
            showCarList();
            updateChart();
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    public void AddCommand()
    {
        
        Integer ClientId = null;
        Integer CarId = null;
        Integer StockCar = null;
        String sql = "INSERT INTO commande (idclient, idvoiture, numerocommande, quantity, date) VALUES(?, ?, ?, ?, ?)";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try{
            Alert alert;
            if(numCommTextFIeld.getText().isEmpty() || numCarCommCB.getSelectionModel().getSelectedItem() == null|| numCliCommCB.getSelectionModel().getSelectedItem() == null || qteCommTextField.getText().isEmpty())
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            }else{
                String check = "SELECT numerocommande FROM commande where numerocommande = '"+numCommTextFIeld.getText()+"'";
                statement = connect.createStatement();
                result = statement.executeQuery(check);
                if(result.next())
                {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Command with number : "+numCommTextFIeld.getText()+" already exist !");
                alert.showAndWait();
                }
                else{
                    int qte = Integer.parseInt((String)qteCommTextField.getText());
                    prepare = connect.prepareStatement(sql);
                    Statement smtCli = connect.createStatement();
                    
            //CLIENTId
            String numCli = (String)numCliCommCB.getSelectionModel().getSelectedItem();
            String sqlC = "SELECT id from client where number = '"+numCli+"'   ";
            ResultSet rsIdCli = smtCli.executeQuery(sqlC);
            while(rsIdCli.next())
            {
                 ClientId = rsIdCli.getInt("id");      
            }
            //CARId
            String numVoi = (String)numCarCommCB.getSelectionModel().getSelectedItem();
            Statement smtVoiture = connect.createStatement();
            String queryVoiture = "select id, stock from voiture where number = '"+numVoi+"' ";
            ResultSet rsIdVoiture = smtVoiture.executeQuery(queryVoiture);
            if(rsIdVoiture.next())
            {
                CarId = Integer.valueOf(rsIdVoiture.getString("id"));
                StockCar = rsIdVoiture.getInt("stock");
            }  
            if(StockCar<qte)
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Insuffisant Stock !");
                alert.showAndWait();
            }
            else{
                //DATE
                DatePicker datePicker = new DatePicker();
                datePicker.setValue(dateComm.getValue());
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedValue = (dateComm.getValue()).format(dateFormatter);
                dateComm.setValue(LocalDate.parse(formattedValue,dateFormatter));
                java.util.Date date = java.util.Date.from(dateComm.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                
                //STOCK MOOUVEMENT
                
                int totale_stock= (StockCar-qte);
            String etat_stock = "update voiture set stock = '"+totale_stock+"' where id = "+CarId;
            Statement smt = connect.createStatement();
            
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            prepare.setInt(1, ClientId);
            prepare.setInt(2, CarId);
            prepare.setString(3, numCommTextFIeld.getText());
            prepare.setInt(4, qte);
            prepare.setDate(5, sqlDate);
            smt.execute(etat_stock);
            prepare.executeUpdate();
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successfully Added !");
                alert.showAndWait();
                
                CommandClear();
                showCommandList();
                showCarList();
                updateChart();
                    } 
                }
            }
   
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void CarClear()
    {
        numberCarTextField.setText("");
        unitPriceTCarextField.setText("");
        designCarTextField.setText("");
        stockCarTextField.setText("");
    }
    
    public void CarDelete()
    {
        String sql = "DELETE FROM voiture where number = '"+numberCarTextField.getText()+"'";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try
        {
            Alert alert; 
            if(numberCarTextField.getText().isEmpty() || unitPriceTCarextField.getText().isEmpty() || designCarTextField.getText().isEmpty() || stockCarTextField.getText().isEmpty())
            {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("There is no data to delete !");
            alert.showAndWait();
            }
            else
            {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to delete car number : "+numberCarTextField.getText()+" ?");
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK))
                {
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted !");
                    alert.showAndWait();
                    
                    CarClear();
            showCarList();
            NumCarCB();
            
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void CarUpdate()
    {
        int pu = Integer.parseInt(unitPriceTCarextField.getText());
        int st = Integer.parseInt(stockCarTextField.getText());
        carData carD = CarTBV.getSelectionModel().getSelectedItem();
        String i = String.valueOf(carD.getId());
        String sql = "UPDATE voiture SET number = '"+numberCarTextField.getText()+"', design = '"+designCarTextField.getText()+"', pu = '"+pu+"', stock = '"+st+"' where id = '"+i+"'";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try{
            Alert alert;
            if(numberCarTextField.getText().isEmpty() || unitPriceTCarextField.getText().isEmpty() || designCarTextField.getText().isEmpty() || stockCarTextField.getText().isEmpty())
            {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("There is no data to update !");
            alert.showAndWait();
            }
            else{
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to udapte car : "+i+" ? ");
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK))
                {
                statement = connect.createStatement();
                statement.executeUpdate(sql);
                
                alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Car updated successfully !");
            alert.showAndWait();
            
            CarClear();
            NumCarCB();
            showCarList();
                    
                }
                
            }
            
        }
     catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    
    public void CarAdd()
    {
        String sql = "INSERT INTO voiture (number, design, pu, stock) VALUES(?, ?, ?, ?)";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try{
            Alert alert;
            if(numberCarTextField.getText().isEmpty() || unitPriceTCarextField.getText().isEmpty() || designCarTextField.getText().isEmpty() || stockCarTextField.getText().isEmpty())
            {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            }else{
                String check = "SELECT number FROM voiture where number = '"+numberCarTextField.getText()+"'";
                statement = connect.createStatement();
                result = statement.executeQuery(check);
                if(result.next())
                {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Car with number : "+numberCarTextField.getText()+" already exist !");
                alert.showAndWait();
                }
                else{
            int pu = Integer.parseInt(unitPriceTCarextField.getText());
            int st = Integer.parseInt(stockCarTextField.getText());
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, numberCarTextField.getText());
            prepare.setString(2, designCarTextField.getText());
            prepare.setInt(3, pu);
            prepare.setInt(4, st);
            prepare.executeUpdate();
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successfully Added !");
                alert.showAndWait();
                
                CarClear();
                showCarList();
                NumCarCB();
                    } 
            }
   
        }
        catch(Exception e)
        {
            
        }
    }
    
    public void addClientDelete()
    {
        String sql = "DELETE FROM client where number = '"+numberCliTextField.getText()+"'";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try
        {
            Alert alert; 
            if(numberCliTextField.getText().isEmpty() || nameCliTextField.getText().isEmpty())
            {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("There is no data to delete !");
            alert.showAndWait();
            }
            else
            {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to delete client number : "+numberCliTextField.getText()+" ?");
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK))
                {
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted !");
                    alert.showAndWait();
                    
                    addClientShowListData();
                clientReset();
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void addClientUpdate()
    {   clientData clientD = ClientTBV.getSelectionModel().getSelectedItem();
        String i = String.valueOf(clientD.getId());
        String sql = "UPDATE client SET number = '"+numberCliTextField.getText()+"', name = '"+nameCliTextField.getText()+"' where id = '"+i+"'";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try{
            Alert alert;
            if(numberCliTextField.getText().isEmpty() || nameCliTextField.getText().isEmpty())
            {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("There is no data to update !");
            alert.showAndWait();
            }
            else{
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to udapte Client : "+i+" ? ");
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK))
                {
                statement = connect.createStatement();
                statement.executeUpdate(sql);
                
                alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Client updated successfully !");
            alert.showAndWait();
            
            addClientShowListData();
                clientReset();
                    
                }
                
            }
            
        }
     catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    
    public void addClienAdd()
            
    {
        String sql = "INSERT INTO client (number, name) VALUES(?, ?) ";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        try{
            Alert alert;
            if(numberCliTextField.getText().isEmpty() || nameCliTextField.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            }else{
                String check = "SELECT number FROM client where number = '"+numberCliTextField.getText()+"'";
                statement = connect.createStatement();
                result = statement.executeQuery(check);
                if(result.next())
                {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Client with number : "+numberCliTextField.getText()+" already exist !");
                alert.showAndWait();
                }
                else{
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, numberCliTextField.getText());
            prepare.setString(2, nameCliTextField.getText());
            prepare.executeUpdate();
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successfully Added !");
                alert.showAndWait();
                addClientShowListData();
                clientReset();
                    } 
            }
   
        }
        catch(Exception e)
        {
            
        }
       
    }
   
    public void clientReset()
    {
        numberCliTextField.setText("");
        nameCliTextField.setText("");
    }
    
   public void switchForm(ActionEvent event)
            
   {
        if(event.getSource()== HomeBTN)
        {
            HomePane.setVisible(true);
           ClientFORM.setVisible(false);
           CarPane.setVisible(false);
           CommandPane.setVisible(false);
           carsCommandedPane.setVisible(false);
           listOfCarPane.setVisible(false);
           SFPANE.setVisible(false);
           invoicePANE.setVisible(false);
            HomeBTN.setStyle("-fx-background-color:transparent");
            HomeBTN.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c)");
            ClientBtn.setStyle("-fx-background-color:transparent");
            CarBtn.setStyle("-fx-background-color:transparent");
            carsCommandedBtn.setStyle("-fx-background-color:transparent");
            listOfCarBtn.setStyle("-fx-background-color:transparent");
            SFTBTN.setStyle("-fx-background-color:transparent");
            invoiceBTN.setStyle("-fx-background-color:transparent");
            MarketBtn.setStyle("-fx-background-color:transparent");
            displayUsername();
            
            
        }
        else if(event.getSource() == ClientBtn)
        {
            HomePane.setVisible(false);
             ClientFORM.setVisible(true);
            CarPane.setVisible(false);
             CommandPane.setVisible(false);
             carsCommandedPane.setVisible(false);
             listOfCarPane.setVisible(false);
             SFPANE.setVisible(false);
             invoicePANE.setVisible(false);
             ClientBtn.setStyle("-fx-background-color:transparent");
             ClientBtn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c)");
             HomeBTN.setStyle("-fx-background-color:transparent");
             CarBtn.setStyle("-fx-background-color:transparent");
             MarketBtn.setStyle("-fx-background-color:transparent");
             carsCommandedBtn.setStyle("-fx-background-color:transparent");
             listOfCarBtn.setStyle("-fx-background-color:transparent");
             SFTBTN.setStyle("-fx-background-color:transparent");
             invoiceBTN.setStyle("-fx-background-color:transparent");
        }
        else if(event.getSource() == CarBtn)
        {
            CarPane.setVisible(true);
             ClientFORM.setVisible(false);
             HomePane.setVisible(false);
             CommandPane.setVisible(false);
             carsCommandedPane.setVisible(false);
             listOfCarPane.setVisible(false);
             SFPANE.setVisible(false);
             invoicePANE.setVisible(false);
             CarBtn.setStyle("-fx-background-color:transparent");
             CarBtn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c)");
             ClientBtn.setStyle("-fx-background-color:transparent");
             HomeBTN.setStyle("-fx-background-color:transparent");
             MarketBtn.setStyle("-fx-background-color:transparent");
             carsCommandedBtn.setStyle("-fx-background-color:transparent");
             listOfCarBtn.setStyle("-fx-background-color:transparent");
             SFTBTN.setStyle("-fx-background-color:transparent");
             invoiceBTN.setStyle("-fx-background-color:transparent");
        }
        else if(event.getSource() == MarketBtn)
        {
            CarPane.setVisible(false);
            ClientFORM.setVisible(false);
            HomePane.setVisible(false);
            CommandPane.setVisible(true);
            carsCommandedPane.setVisible(false);
            listOfCarPane.setVisible(false);
            SFPANE.setVisible(false);
            invoicePANE.setVisible(false);
            MarketBtn.setStyle("-fx-background-color:transparent");
            MarketBtn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c)");
            ClientBtn.setStyle("-fx-background-color:transparent");
            CarBtn.setStyle("-fx-background-color:transparent");
            HomeBTN.setStyle("-fx-background-color:transparent");
            carsCommandedBtn.setStyle("-fx-background-color:transparent");
            listOfCarBtn.setStyle("-fx-background-color:transparent");
            SFTBTN.setStyle("-fx-background-color:transparent");
            invoiceBTN.setStyle("-fx-background-color:transparent");
        }
        else if(event.getSource() == carsCommandedBtn)
        {
            CarPane.setVisible(false);
            ClientFORM.setVisible(false);
            HomePane.setVisible(false);
            CommandPane.setVisible(false);
            carsCommandedPane.setVisible(true);
            listOfCarPane.setVisible(false);
            SFPANE.setVisible(false);
            invoicePANE.setVisible(false);
            carsCommandedBtn.setStyle("-fx-background-color:transparent");
            carsCommandedBtn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c)");
            ClientBtn.setStyle("-fx-background-color:transparent");
            CarBtn.setStyle("-fx-background-color:transparent");
            MarketBtn.setStyle("-fx-background-color:transparent");
            HomeBTN.setStyle("-fx-background-color:transparent");
            listOfCarBtn.setStyle("-fx-background-color:transparent");
            SFTBTN.setStyle("-fx-background-color:transparent");
            invoiceBTN.setStyle("-fx-background-color:transparent");
            
        }
        else if(event.getSource() == listOfCarBtn)
        {
            CarPane.setVisible(false);
            ClientFORM.setVisible(false);
            HomePane.setVisible(false);
            CommandPane.setVisible(false);
            carsCommandedPane.setVisible(false);
            listOfCarPane.setVisible(true);
            SFPANE.setVisible(false);
            invoicePANE.setVisible(false);
            listOfCarBtn.setStyle("-fx-background-color:transparent");
            listOfCarBtn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c)");
            ClientBtn.setStyle("-fx-background-color:transparent");
            CarBtn.setStyle("-fx-background-color:transparent");
            MarketBtn.setStyle("-fx-background-color:transparent");
            HomeBTN.setStyle("-fx-background-color:transparent");
            carsCommandedBtn.setStyle("-fx-background-color:transparent");
            SFTBTN.setStyle("-fx-background-color:transparent");
            invoiceBTN.setStyle("-fx-background-color:transparent");
        }
        else if(event.getSource() == SFTBTN)
        {
            CarPane.setVisible(false);
            ClientFORM.setVisible(false);
            HomePane.setVisible(false);
            CommandPane.setVisible(false);
            carsCommandedPane.setVisible(false);
            listOfCarPane.setVisible(false);
            SFPANE.setVisible(true);
            invoicePANE.setVisible(false);
            SFTBTN.setStyle("-fx-background-color:transparent");
            SFTBTN.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c)");
            ClientBtn.setStyle("-fx-background-color:transparent");
            CarBtn.setStyle("-fx-background-color:transparent");
            MarketBtn.setStyle("-fx-background-color:transparent");
            HomeBTN.setStyle("-fx-background-color:transparent");
            carsCommandedBtn.setStyle("-fx-background-color:transparent");
            listOfCarBtn.setStyle("-fx-background-color:transparent");
            invoiceBTN.setStyle("-fx-background-color:transparent");
        }
        else if(event.getSource() == invoiceBTN)
        {
            CarPane.setVisible(false);
            ClientFORM.setVisible(false);
            HomePane.setVisible(false);
            CommandPane.setVisible(false);
            carsCommandedPane.setVisible(false);
            listOfCarPane.setVisible(false);
            SFPANE.setVisible(false);
            invoicePANE.setVisible(true);
            invoiceBTN.setStyle("-fx-background-color:transparent");
            invoiceBTN.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c)");
            ClientBtn.setStyle("-fx-background-color:transparent");
            CarBtn.setStyle("-fx-background-color:transparent");
            MarketBtn.setStyle("-fx-background-color:transparent");
            HomeBTN.setStyle("-fx-background-color:transparent");
            carsCommandedBtn.setStyle("-fx-background-color:transparent");
            listOfCarBtn.setStyle("-fx-background-color:transparent");
            SFTBTN.setStyle("-fx-background-color:transparent");
        }
        
        
        
            
    }
    
    public void close()
    {
    System.exit(0);
    }
    
    public void minimize(){
        Stage stage = (Stage)main_form.getScene().getWindow();
        stage.setIconified(true);
        
    }
    
    //
    private double x, y = 0;
    public void logout()
    {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Message");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to logout ?");
        Optional<ButtonType> option = alert.showAndWait();
        
        try{
        if(option.get().equals(ButtonType.OK))
        {
            logout.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("FXMLMain.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            
            
            
            root.setOnMousePressed((MouseEvent event) ->
            {
                x = event.getSceneX();
                y = event.getSceneY();
            });
            
            root.setOnMouseDragged((MouseEvent event)->
            {   
                stage.setX(event.getScreenX() -x);
                stage.setY(event.getScreenY() -y);
            });
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(scene);
            stage.show();
        }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
        public void NumClientCB()
    {
        String sql = "SELECT number from client";
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        ArrayList<String> client = new ArrayList();
        try
        {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select number from client");
            while(rs.next())
            {
              client.add(rs.getString("number"));
            }
            ObservableList listData = FXCollections.observableArrayList(client);
            numCliCommCB.setItems(listData);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void NumCarCB()
    {
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        connect = dbc.getConnection();
        ArrayList<String> car = new ArrayList();
        try
        {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select number from voiture");
            while(rs.next())
            {
              car.add(rs.getString("number"));
            }
            ObservableList listData = FXCollections.observableArrayList(car);
            numCarCommCB.setItems(listData);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        displayUsername();
        addClientShowListData();
        showCarList();
        showCommandList();
        NumClientCB();
        NumCarCB();
        CarName();
        ClientName();
        //chart();
        chartFinal();
        
    }
    
}
