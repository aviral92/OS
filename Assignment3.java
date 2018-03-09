 import java.awt.*;
 import java.awt.event.*;
import javax.swing.*;
public class Assignment3 extends JFrame implements ActionListener {
    private JCheckBox chk1;
    private JCheckBox chk2;
    private JCheckBox chk3;
    private JComboBox cbox;
    private JRadioButton bt1;
    private JRadioButton bt2;
    private JTextArea txt;
    private JLabel label;
    
    
    String alpha[]={"A","B","C","D","E"};
   
    public static void main(String[] args) {
        Assignment3 frame = new Assignment3();
        frame.setSize(500,400);
        frame.setLocation(300,300);
	frame.setTitle("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       
    }
    public Assignment3()
    {
        JPanel jp1= new JPanel();

        chk1=new JCheckBox("CheckBox 1");
        chk1.setMnemonic(KeyEvent.VK_C); 
   	chk1.setSelected(false);

	chk2=new JCheckBox("CheckBox 2");
	chk2.setMnemonic(KeyEvent.VK_G); 
    	chk2.setSelected(false);

	chk3=new JCheckBox("CheckBox 3");
	chk3.setMnemonic(KeyEvent.VK_G); 
    	chk3.setSelected(false);
  
        
        cbox=new JComboBox(alpha);
	cbox.setSelectedIndex(0);
        
        bt1=new JRadioButton("Male");
        bt2=new JRadioButton("Female");
	        
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(bt1);
        btnGroup.add(bt2);
       
        jp1.setLayout(new FlowLayout());
        jp1.add(chk1); 
        jp1.add(chk2);
        jp1.add(chk3);
        jp1.add(cbox);      
        jp1.add(bt1);
        jp1.add(bt2);


	chk1.addActionListener(this);
	chk2.addActionListener(this);
	chk3.addActionListener(this);
        cbox.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);

	JPanel jp2= new JPanel();
	txt=new JTextArea(5,30);
        jp2.setLayout(new FlowLayout());
        jp2.add(txt);  

 
	JPanel jp3= new JPanel();
        label=new JLabel("  The action is: ");   
        jp3.setLayout(new FlowLayout());
        jp3.add(label);

        
        getContentPane().setLayout(new BorderLayout());       
        getContentPane().add(jp1,BorderLayout.NORTH);       
        getContentPane().add(jp2,BorderLayout.CENTER);
        getContentPane().add(jp3,BorderLayout.WEST); 
        
            }

         public void actionPerformed(ActionEvent x) {
         txt.setText(x.getActionCommand());         
    }
}
