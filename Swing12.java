import javax.swing.*;



public class Swing12 

{
         JFrame f;


         Swing12()

         {
              f= new JFrame("Combobox Example");

              String country[]={"India", "Australia", "UK", "USA","Russia"};

       JComboBox jc= new JComboBox<>(country);


       jc.setBounds(50,50,90,20);

       f.add(jc);

       f.setLayout(null);

       f.setSize(400,300);

       f.setVisible(true);

         }

         public static void main(String[] args) {
              
              new Swing12();
         }

       
}
