import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

class ASSIGNMENTMP extends JFrame implements ActionListener{
    
  private static final int frame_width = 1812;
    private static final int frame_height = 1700;
    private JLabel L,a;
    private JRadioButton one, two; 
    ButtonGroup mm ; 
    JTextField m;
    private JButton Confirm,Cancel;
    JPanel mmm;
    private Container mmpp; 

    public ASSIGNMENTMP () throws MalformedURLException, IOException{
    setTitle("MAYSAAA ALSHAREEEF  ");
    setSize(frame_width,frame_height);
    Container contPane = getContentPane();
    mmm = new JPanel();
    mmm.setBorder(BorderFactory.createTitledBorder("Buy your YSL heels : ")); 

    L= new JLabel(" Choose your heels");  
    mmpp.add(L);
    URL url = new URL("file:///C:/Users/MAYSAA/OneDrive/%D8%B3%D8%B7%D8%AD%20%D8%A7%D9%84%D9%85%D9%83%D8%AA%D8%A8/photo_2023-05-09_22-06-06.jpg"); 
        Image image = ImageIO.read(url);
        final ImageIcon imageIcon = new ImageIcon(image); 
    URL url2 = new URL("file:///C:/Users/MAYSAA/OneDrive/%D8%B3%D8%B7%D8%AD%20%D8%A7%D9%84%D9%85%D9%83%D8%AA%D8%A8/photo_2023-05-09_22-06-13.jpg");
        Image image2 = ImageIO.read(url2);
        final ImageIcon imageIcon2 = new ImageIcon(image2);     
        
one= new JRadioButton("HEELS 1",imageIcon);
two = new JRadioButton("HEELS 2",imageIcon2); 
mm = new ButtonGroup(); 
mmpp.add(one); 
mmpp.add(two); 
one.setSelected(true);

mmm.add(one);
mmm.add(two);


a= new JLabel("Please Enter Your address : ");  
m= new JTextField(50);

mmm.add(a);
mmm.add(m);



Confirm= new JButton("Confirm"); 
Confirm.addActionListener(this); 
Cancel= new JButton("Cancel"); 
Cancel.addActionListener(this); 
JPanel  p2 = new JPanel();

p2.add(Confirm);
p2.add(Cancel);

contPane.add(mmm,BorderLayout.CENTER);
contPane.add(p2,BorderLayout.SOUTH);


 setDefaultCloseOperation(EXIT_ON_CLOSE);
   
    }

  @Override
  public void actionPerformed(ActionEvent e) {
    String y ="";
        if(e.getSource()==Confirm){
            String x =m.getText();
            m.setText(" Your Order is succeed " +x);
            if(one.isSelected()){
                 y+=one.getText();
            JOptionPane.showMessageDialog(null, y + " product purchase succeed ");}
            else {
              y+=two.getText();
            JOptionPane.showMessageDialog(null, y + " product purchase succeed ");}
            }
        else {
         m.setText(" Your Order is Canceled  ");
        }}

public static void main(String[] args) throws IOException { 
  ASSIGNMENTMP obj = new ASSIGNMENTMP();
    obj.setVisible(true);
    }
}