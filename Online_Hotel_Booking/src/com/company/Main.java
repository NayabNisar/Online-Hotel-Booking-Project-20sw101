
/*
* ****************************************************
*               Name   --->Nayab Nisar               *
*               Roll no--->20sw101                   *
*               Section--->(II)                      *
*               Project---->Online Hotel Booking     *
*               Semester ---->Second Semester        *
* *****************************************************
* */
package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Main extends JFrame implements ActionListener {
    JFrame frame;
    JRadioButton next;
    JLabel lbl;
    Font myfont;
    Font myfont1;
    JRadioButton b1;
    JRadioButton b2;
    JRadioButton b3;
    JRadioButton b4;
    JRadioButton b5;
    JRadioButton b6;
    JRadioButton b7;
    JRadioButton b8;
    JRadioButton b9;
    JRadioButton b10;

    public Main() {

        setTitle("Hotel Booknig");
        //Background Image
        //setSize(600, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\Image.jpg")));
        setLayout(new FlowLayout());
        setSize(599, 899);
        setSize(600, 900);

        //Intro

        lbl = new JLabel("ISLAMABAD THE SMART CITY");
        myfont = new Font("Serief", Font.BOLD, 60);
        lbl.setFont(myfont);

        //Sign_in Button
        next = new JRadioButton("");

        //Adding in Frame
        next.addActionListener(this);
        add(next);
        add(lbl);

        //Frame Setting

        setVisible(true);
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new Main();

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {

            JFrame frame1 = new JFrame(" Top 10 Hotel's Of Islamabad ");

            //Background Image
            frame1.setSize(900, 900);
            frame1.setLocationRelativeTo(null);
            frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame1.setVisible(true);
            frame1.setLayout(new BorderLayout());
            frame1.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\Hotel_Image.jpg")));
            frame1.setLayout(new FlowLayout());
            frame1.getContentPane().setBackground(Color.GRAY);
//Buttons
            b1 = new JRadioButton("Sarena Hotel");
            b1.setBounds(300, 250, 200, 50);
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    JFrame frame=new JFrame("Form");

                    frame.setSize(800, 900);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());
                    frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\image1.jpg")));
                    frame.setLayout(new FlowLayout());
                    frame.getContentPane().setBackground(Color.RED);

                    JLabel title = new JLabel("SERENA HOTEL");

                    title.setBounds(150,10,300,50);
                    title.setFont(new Font("Serif", Font.BOLD, 30));
                    title.setForeground(Color.BLACK);
                    frame.add(title);
                    JLabel reservation=new JLabel("Reservation Details");
                    reservation.setBounds(40,20,180,100);
                    // First Name

                    JLabel f_name = new JLabel(" First Name");
                    f_name.setBounds(40, 60, 80, 100);

                    JTextField name = new JTextField();
                    name.setBounds(40, 120, 160, 30);
                    //Last_Name
                    JLabel l_name = new JLabel("Last Name");
                    l_name.setBounds(250, 60, 100, 100);

                    JTextField last_name= new JTextField();
                    last_name.setBounds(250, 120, 160, 30);

                    //CNIC
                    JLabel cnic=new JLabel("CNIC");
                    cnic.setBounds(40,130,280,100);
                    JTextField cnic_no=new JTextField();
                    cnic_no.setBounds(40, 195, 250, 30);
                    //Email

                    JLabel email = new JLabel("Email Address");
                    email.setBounds(40, 205, 100, 100);
                    JTextField email_text = new JTextField();
                    email_text.setBounds(40, 270, 160, 30);

                    //Phone no

                    JLabel phone_no = new JLabel("Phone_no");
                    phone_no.setBounds(250, 205, 100, 100);
                    JTextField phone_text = new JTextField();
                    phone_text.setBounds(250, 270, 160, 30);
                    phone_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = phone_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                phone_text.setEditable(true);
                            } else {
                                phone_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "Enter only numeric digits(0-9)");
                            }
                        }
                    });


                    //Region of residence

                    JLabel residence=new JLabel("Region of Residence");
                    residence.setBounds(40,285,140,100);
                    JTextField residence_text=new JTextField();
                    residence_text.setBounds(40,350,140,30);
                    //State
                    JLabel state=new JLabel("State");
                    state.setBounds(200,285,100,100);
                    JTextField state_text=new JTextField();
                    state_text.setBounds(200,350,100,30);

                    //Zipcode

                    JLabel zipcode=new JLabel("Zip Code");
                    zipcode.setBounds(310,285,100,100);
                    JTextField zipcode_text=new JTextField();
                    zipcode_text.setBounds(310,350,100,30);

                    //Check in:
                    JLabel Check_in=new JLabel("Check_in_Date:");
                    Check_in.setBounds(40,370,130,100);

                    String date[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates = new JComboBox(date);
                    dates.setBounds(170, 400, 40, 30);

                    String mon[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months=new JComboBox(mon);
                    months.setBounds(220,400,60,30);

                    String Year[]={"2021","2022"};
                    JComboBox year=new JComboBox(Year);
                    year.setBounds(290,400,60,30);

                    //Check_out

                    JLabel Check_out=new JLabel("Check_Out_Date:");
                    Check_out.setBounds(40,410,130,100);

                    String date_exit[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates_exit = new JComboBox(date_exit);
                    dates_exit.setBounds(170, 450, 40, 30);

                    String mon_exit[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months_exit=new JComboBox(mon_exit);
                    months_exit.setBounds(220,450,60,30);

                    String Year_exit[]={"2021","2022"};
                    JComboBox year_exit=new JComboBox(Year_exit);
                    year_exit.setBounds(290,450,60,30);

                    ButtonGroup bg;


                    //Room Preference
                    JLabel R_Prefernce=new JLabel("Room Prefernce");
                    R_Prefernce.setBounds(40,480,100,100);
                    JRadioButton Stand = new JRadioButton("Standard");
                    Stand.setBounds(160, 515, 100, 30);
                    frame.add(Stand);

                    JRadioButton Del = new JRadioButton("Deluxe");
                    Del.setBounds(260, 515, 90, 30);
                    frame.add(Del);

                    JRadioButton Suite = new JRadioButton("Suite");
                    Suite.setBounds(350, 515, 90, 30);
                    frame.add(Suite);

                    bg = new ButtonGroup();
                    bg.add(Stand);
                    bg.add(Del);
                    bg.add(Suite);


//Payment Method
                    JLabel payment=new JLabel("Payment Method");
                    payment.setBounds(40,535,130,100);

                    JRadioButton r1 = new JRadioButton("Credit Card");
                    r1.setBounds(170, 570, 100, 20);
                    frame.add(r1);
                    bg = new ButtonGroup();
                    bg.add(r1);
                    r1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f4=new JFrame("Card Details");
                            String name=JOptionPane.showInputDialog(f4,"Enter Credit_Card num:");

                        }
                    });
//Clear Button

                    JButton button1 = new JButton("Confirm");
                    button1.setBounds(120, 620, 100, 30);
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f5=new JFrame("Confirm Message");

                            f5.setSize(500, 400);
                            f5.setLocationRelativeTo(null);
                            f5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                            f5.setVisible(true);
                            f5.setLayout(new BorderLayout());
                            f5.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\Reserved.jpg")));
                            f5.setLayout(new FlowLayout());
                            f5.setVisible(true);
                        }
                    });
                    JButton button2 = new JButton("Cancel");
                    button2.setBounds(240, 620, 110, 30);
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    frame.add(button1);
                    frame.add(button2);
//Frame Setting
                    frame.setLayout(null);
                    frame.setSize(600, 800);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                    //Addding to the Panel
                    frame.getContentPane().add(title);
                    frame.getContentPane().add(reservation);
                    frame.getContentPane().add(f_name);
                    frame.getContentPane().add(name);
                    frame.getContentPane().add(l_name);
                    frame.getContentPane().add(last_name);
                    frame.getContentPane().add(cnic);
                    frame.getContentPane().add(cnic_no);
                    frame.getContentPane().add(email);
                    frame.getContentPane().add(email_text);
                    frame.getContentPane().add(phone_no);
                    frame.getContentPane().add(phone_text);
                    frame.getContentPane().add(residence);
                    frame.getContentPane().add(residence_text);
                    frame.getContentPane().add(state);
                    frame.getContentPane().add(state_text);
                    frame.getContentPane().add(zipcode);
                    frame.getContentPane().add(zipcode_text);

                    //check_iN
                    frame.getContentPane().add(Check_in);
                    frame.getContentPane().add(dates);
                    frame.getContentPane().add(year);
                    frame.getContentPane().add(months);
                    //Check out
                    frame.getContentPane().add(Check_out);
                    frame.getContentPane().add(dates_exit);
                    frame.getContentPane().add(months_exit);
                    frame.getContentPane().add(year_exit);
                    frame.getContentPane().add(payment);
                    frame.getContentPane().add(R_Prefernce);


                }});

//Second Hotel Marriott
            b2 = new JRadioButton("Marriott Hotel");

            b2.setBounds(500, 250, 150, 50);
            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame frame=new JFrame("Form");

                    frame.setSize(800, 900);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());
                    frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\image1.jpg")));
                    frame.setLayout(new FlowLayout());
                    frame.getContentPane().setBackground(Color.RED);

                    JLabel title = new JLabel("MARRIOTT HOTEL");

                    title.setBounds(150,10,300,50);
                    title.setFont(new Font("Serif", Font.BOLD, 30));
                    title.setForeground(Color.BLACK);
                    frame.add(title);
                    JLabel reservation=new JLabel("Reservation Details");
                    reservation.setBounds(40,20,180,100);
                    // First Name

                    JLabel f_name = new JLabel(" First Name");
                    f_name.setBounds(40, 60, 80, 100);

                    JTextField name = new JTextField();
                    name.setBounds(40, 120, 160, 30);
                    //Last_Name
                    JLabel l_name = new JLabel("Last Name");
                    l_name.setBounds(250, 60, 100, 100);

                    JTextField last_name= new JTextField();
                    last_name.setBounds(250, 120, 160, 30);

                    //CNIC
                    JLabel cnic=new JLabel("CNIC");
                    cnic.setBounds(40,130,280,100);
                    JTextField cnic_no=new JTextField();
                    cnic_no.setBounds(40, 195, 250, 30);
                    //Email

                    JLabel email = new JLabel("Email Address");
                    email.setBounds(40, 205, 100, 100);
                    JTextField email_text = new JTextField();
                    email_text.setBounds(40, 270, 160, 30);

                    //Phone no

                    JLabel phone_no = new JLabel("Phone_no");
                    phone_no.setBounds(250, 205, 100, 100);
                    JTextField phone_text = new JTextField();
                    phone_text.setBounds(250, 270, 160, 30);

                    phone_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = phone_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                phone_text.setEditable(true);
                            } else {
                                phone_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "Enter only numeric digits(0-9)");
                            }
                        }
                    });


                    //Region of residence

                    JLabel residence=new JLabel("Region of Residence");
                    residence.setBounds(40,285,140,100);
                    JTextField residence_text=new JTextField();
                    residence_text.setBounds(40,350,140,30);
                    //State
                    JLabel state=new JLabel("State");
                    state.setBounds(200,285,100,100);
                    JTextField state_text=new JTextField();
                    state_text.setBounds(200,350,100,30);

                    //Zipcode

                    JLabel zipcode=new JLabel("Zip Code");
                    zipcode.setBounds(310,285,100,100);
                    JTextField zipcode_text=new JTextField();
                    zipcode_text.setBounds(310,350,100,30);
                    zipcode_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = zipcode_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                zipcode_text.setEditable(true);
                            } else {
                                zipcode_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "*Enter only Numeric digits");
                            }
                        }
                    });



                    //Check in:
                    JLabel Check_in=new JLabel("Check_in_Date:");
                    Check_in.setBounds(40,370,130,100);

                    String date[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates = new JComboBox(date);
                    dates.setBounds(170, 400, 40, 30);

                    String mon[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months=new JComboBox(mon);
                    months.setBounds(220,400,60,30);

                    String Year[]={"2021","2022"};
                    JComboBox year=new JComboBox(Year);
                    year.setBounds(290,400,60,30);

                    //Check_out

                    JLabel Check_out=new JLabel("Check_Out_Date:");
                    Check_out.setBounds(40,410,130,100);

                    String date_exit[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates_exit = new JComboBox(date_exit);
                    dates_exit.setBounds(170, 450, 40, 30);

                    String mon_exit[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months_exit=new JComboBox(mon_exit);
                    months_exit.setBounds(220,450,60,30);

                    String Year_exit[]={"2021","2022"};
                    JComboBox year_exit=new JComboBox(Year_exit);
                    year_exit.setBounds(290,450,60,30);

                    ButtonGroup bg;


                    //Room Preference
                    JLabel R_Prefernce=new JLabel("Room Prefernce");
                    R_Prefernce.setBounds(40,480,100,100);
                    JRadioButton Stand = new JRadioButton("Standard");
                    Stand.setBounds(160, 515, 100, 30);
                    frame.add(Stand);

                    JRadioButton Del = new JRadioButton("Deluxe");
                    Del.setBounds(260, 515, 90, 30);
                    frame.add(Del);

                    JRadioButton Suite = new JRadioButton("Suite");
                    Suite.setBounds(350, 515, 90, 30);
                    frame.add(Suite);

                    bg = new ButtonGroup();
                    bg.add(Stand);
                    bg.add(Del);
                    bg.add(Suite);


//Payment Method
                    JLabel payment=new JLabel("Payment Method");
                    payment.setBounds(40,535,130,100);

                    JRadioButton r1 = new JRadioButton("Credit Card");
                    r1.setBounds(170, 570, 100, 20);
                    frame.add(r1);
                    bg = new ButtonGroup();
                    bg.add(r1);
                    r1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f4=new JFrame("Card Details");
                            String name=JOptionPane.showInputDialog(f4,"Enter Credit_Card num:");

                        }
                    });
//Clear Button

                    JButton button1 = new JButton("Confirm");
                    button1.setBounds(120, 620, 100, 30);
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f5=new JFrame("Confirm Message");

                            f5.setSize(500, 400);
                            f5.setLocationRelativeTo(null);
                            f5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                            f5.setVisible(true);
                            f5.setLayout(new BorderLayout());
                            f5.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\Reserved.jpg")));
                            f5.setLayout(new FlowLayout());
                            f5.setVisible(true);
                        }
                    });
                    JButton button2 = new JButton("Cancel");
                    button2.setBounds(240, 620, 110, 30);
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    frame.add(button1);
                    frame.add(button2);
//Frame Setting
                    frame.setLayout(null);
                    frame.setSize(600, 800);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                    //Addding to the Panel
                    frame.getContentPane().add(title);
                    frame.getContentPane().add(reservation);
                    frame.getContentPane().add(f_name);
                    frame.getContentPane().add(name);
                    frame.getContentPane().add(l_name);
                    frame.getContentPane().add(last_name);
                    frame.getContentPane().add(cnic);
                    frame.getContentPane().add(cnic_no);
                    frame.getContentPane().add(email);
                    frame.getContentPane().add(email_text);
                    frame.getContentPane().add(phone_no);
                    frame.getContentPane().add(phone_text);
                    frame.getContentPane().add(residence);
                    frame.getContentPane().add(residence_text);
                    frame.getContentPane().add(state);
                    frame.getContentPane().add(state_text);
                    frame.getContentPane().add(zipcode);
                    frame.getContentPane().add(zipcode_text);

                    //check_iN
                    frame.getContentPane().add(Check_in);
                    frame.getContentPane().add(dates);
                    frame.getContentPane().add(year);
                    frame.getContentPane().add(months);
                    //Check out
                    frame.getContentPane().add(Check_out);
                    frame.getContentPane().add(dates_exit);
                    frame.getContentPane().add(months_exit);
                    frame.getContentPane().add(year_exit);
                    frame.getContentPane().add(payment);
                    frame.getContentPane().add(R_Prefernce);



                }
                });

            b3 = new JRadioButton("Jasmine Hotel ");
            b3.setBounds(300, 300, 200, 50);

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    JFrame frame=new JFrame("Form");

                    frame.setSize(800, 900);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());
                    frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\image1.jpg")));
                    frame.setLayout(new FlowLayout());
                    frame.getContentPane().setBackground(Color.RED);

                    JLabel title = new JLabel("JASMINE HOTEL");

                    title.setBounds(150,10,300,50);
                    title.setFont(new Font("Serif", Font.BOLD, 30));
                    title.setForeground(Color.BLACK);
                    frame.add(title);
                    JLabel reservation=new JLabel("Reservation Details");
                    reservation.setBounds(40,20,180,100);
                    // First Name

                    JLabel f_name = new JLabel(" First Name");
                    f_name.setBounds(40, 60, 80, 100);

                    JTextField name = new JTextField();
                    name.setBounds(40, 120, 160, 30);
                    //Last_Name
                    JLabel l_name = new JLabel("Last Name");
                    l_name.setBounds(250, 60, 100, 100);

                    JTextField last_name= new JTextField();
                    last_name.setBounds(250, 120, 160, 30);

                    //CNIC
                    JLabel cnic=new JLabel("CNIC");
                    cnic.setBounds(40,130,280,100);
                    JTextField cnic_no=new JTextField();
                    cnic_no.setBounds(40, 195, 250, 30);
                    //Email

                    JLabel email = new JLabel("Email Address");
                    email.setBounds(40, 205, 100, 100);
                    JTextField email_text = new JTextField();
                    email_text.setBounds(40, 270, 160, 30);

                    //Phone no

                    JLabel phone_no = new JLabel("Phone_no");
                    phone_no.setBounds(250, 205, 100, 100);
                    JTextField phone_text = new JTextField();
                    phone_text.setBounds(250, 270, 160, 30);

                    phone_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = phone_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                phone_text.setEditable(true);
                            } else {
                                phone_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "Enter only numeric digits(0-9)");
                            }
                        }
                    });



                    //Region of residence

                    JLabel residence=new JLabel("Region of Residence");
                    residence.setBounds(40,285,140,100);
                    JTextField residence_text=new JTextField();
                    residence_text.setBounds(40,350,140,30);
                    //State
                    JLabel state=new JLabel("State");
                    state.setBounds(200,285,100,100);
                    JTextField state_text=new JTextField();
                    state_text.setBounds(200,350,100,30);

                    //Zipcode

                    JLabel zipcode=new JLabel("Zip Code");
                    zipcode.setBounds(310,285,100,100);
                    JTextField zipcode_text=new JTextField();
                    zipcode_text.setBounds(310,350,100,30);
                    zipcode_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = zipcode_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                zipcode_text.setEditable(true);
                            } else {
                                zipcode_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "*Enter only Numeric digits");
                            }
                        }
                    });

                    //Check in:
                    JLabel Check_in=new JLabel("Check_in_Date:");
                    Check_in.setBounds(40,370,130,100);

                    String date[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates = new JComboBox(date);
                    dates.setBounds(170, 400, 40, 30);

                    String mon[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months=new JComboBox(mon);
                    months.setBounds(220,400,60,30);

                    String Year[]={"2021","2022"};
                    JComboBox year=new JComboBox(Year);
                    year.setBounds(290,400,60,30);

                    //Check_out

                    JLabel Check_out=new JLabel("Check_Out_Date:");
                    Check_out.setBounds(40,410,130,100);

                    String date_exit[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates_exit = new JComboBox(date_exit);
                    dates_exit.setBounds(170, 450, 40, 30);

                    String mon_exit[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months_exit=new JComboBox(mon_exit);
                    months_exit.setBounds(220,450,60,30);

                    String Year_exit[]={"2021","2022"};
                    JComboBox year_exit=new JComboBox(Year_exit);
                    year_exit.setBounds(290,450,60,30);

                    ButtonGroup bg;


                    //Room Preference
                    JLabel R_Prefernce=new JLabel("Room Prefernce");
                    R_Prefernce.setBounds(40,480,100,100);
                    JRadioButton Stand = new JRadioButton("Standard");
                    Stand.setBounds(160, 515, 100, 30);
                    frame.add(Stand);

                    JRadioButton Del = new JRadioButton("Deluxe");
                    Del.setBounds(260, 515, 90, 30);
                    frame.add(Del);

                    JRadioButton Suite = new JRadioButton("Suite");
                    Suite.setBounds(350, 515, 90, 30);
                    frame.add(Suite);

                    bg = new ButtonGroup();
                    bg.add(Stand);
                    bg.add(Del);
                    bg.add(Suite);


//Payment Method
                    JLabel payment=new JLabel("Payment Method");
                    payment.setBounds(40,535,130,100);

                    JRadioButton r1 = new JRadioButton("Credit Card");
                    r1.setBounds(170, 570, 100, 20);
                    frame.add(r1);
                    bg = new ButtonGroup();
                    bg.add(r1);
                    r1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f4=new JFrame("Card Details");
                            String name=JOptionPane.showInputDialog(f4,"Enter Credit_Card num:");

                        }
                    });
//Clear Button

                    JButton button1 = new JButton("Confirm");
                    button1.setBounds(120, 620, 100, 30);
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f5=new JFrame("Confirm Message");

                            f5.setSize(500, 400);
                            f5.setLocationRelativeTo(null);
                            f5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                            f5.setVisible(true);
                            f5.setLayout(new BorderLayout());
                            f5.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\Reserved.jpg")));
                            f5.setLayout(new FlowLayout());
                            f5.setVisible(true);
                        }
                    });
                    JButton button2 = new JButton("Cancel");
                    button2.setBounds(240, 620, 110, 30);
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    frame.add(button1);
                    frame.add(button2);
//Frame Setting
                    frame.setLayout(null);
                    frame.setSize(600, 800);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                    //Addding to the Panel
                    frame.getContentPane().add(title);
                    frame.getContentPane().add(reservation);
                    frame.getContentPane().add(f_name);
                    frame.getContentPane().add(name);
                    frame.getContentPane().add(l_name);
                    frame.getContentPane().add(last_name);
                    frame.getContentPane().add(cnic);
                    frame.getContentPane().add(cnic_no);
                    frame.getContentPane().add(email);
                    frame.getContentPane().add(email_text);
                    frame.getContentPane().add(phone_no);
                    frame.getContentPane().add(phone_text);
                    frame.getContentPane().add(residence);
                    frame.getContentPane().add(residence_text);
                    frame.getContentPane().add(state);
                    frame.getContentPane().add(state_text);
                    frame.getContentPane().add(zipcode);
                    frame.getContentPane().add(zipcode_text);

                    //check_iN
                    frame.getContentPane().add(Check_in);
                    frame.getContentPane().add(dates);
                    frame.getContentPane().add(year);
                    frame.getContentPane().add(months);
                    //Check out
                    frame.getContentPane().add(Check_out);
                    frame.getContentPane().add(dates_exit);
                    frame.getContentPane().add(months_exit);
                    frame.getContentPane().add(year_exit);
                    frame.getContentPane().add(payment);
                    frame.getContentPane().add(R_Prefernce);

                }

                } );


            b4 = new JRadioButton("Margala Hotel");
            b4.setBounds(500, 300, 150, 50);

            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    JFrame frame=new JFrame("Form");

                    frame.setSize(900, 900);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());
                    frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\image1.jpg")));
                    frame.setLayout(new FlowLayout());
                    frame.getContentPane().setBackground(Color.RED);

                    Font myfont;
                    JLabel title = new JLabel("MARGALA HOTEL");

                    title.setBounds(150,10,300,50);
                    title.setFont(new Font("Serif", Font.ITALIC, 30));
                    title.setForeground(Color.BLACK);
                    frame.add(title);
                    JLabel reservation=new JLabel("Reservation Details");
                    reservation.setBounds(40,20,180,100);
                    // First Name

                    JLabel f_name = new JLabel(" First Name");
                    f_name.setBounds(40, 60, 80, 100);

                    JTextField name = new JTextField();
                    name.setBounds(40, 120, 160, 30);
                    //Last_Name
                    JLabel l_name = new JLabel("Last Name");
                    l_name.setBounds(250, 60, 100, 100);

                    JTextField last_name= new JTextField();
                    last_name.setBounds(250, 120, 160, 30);

                    //CNIC
                    JLabel cnic=new JLabel("CNIC");
                    cnic.setBounds(40,130,280,100);
                    JTextField cnic_no=new JTextField();
                    cnic_no.setBounds(40, 195, 250, 30);
                    //Email

                    JLabel email = new JLabel("Email Address");
                    email.setBounds(40, 205, 100, 100);
                    JTextField email_text = new JTextField();
                    email_text.setBounds(40, 270, 160, 30);

                    //Phone no

                    JLabel phone_no = new JLabel("Phone_no");
                    phone_no.setBounds(250, 205, 100, 100);
                    JTextField phone_text = new JTextField();
                    phone_text.setBounds(250, 270, 160, 30);

                    phone_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = phone_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                phone_text.setEditable(true);
                            } else {
                                phone_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "Enter only numeric digits(0-9)");
                            }
                        }
                    });


                    //Region of residence

                    JLabel residence=new JLabel("Region of Residence");
                    residence.setBounds(40,285,140,100);
                    JTextField residence_text=new JTextField();
                    residence_text.setBounds(40,350,140,30);
                    //State
                    JLabel state=new JLabel("State");
                    state.setBounds(200,285,100,100);
                    JTextField state_text=new JTextField();
                    state_text.setBounds(200,350,100,30);

                    //Zipcode

                    JLabel zipcode=new JLabel("Zip Code");
                    zipcode.setBounds(310,285,100,100);
                    JTextField zipcode_text=new JTextField();
                    zipcode_text.setBounds(310,350,100,30);

                    zipcode_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = zipcode_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                zipcode_text.setEditable(true);
                            } else {
                                zipcode_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "*Enter only Numeric digits");
                            }
                        }
                    });


                    //Check in:
                    JLabel Check_in=new JLabel("Check_in_Date:");
                    Check_in.setBounds(40,370,130,100);

                    String date[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates = new JComboBox(date);
                    dates.setBounds(170, 400, 40, 30);

                    String mon[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months=new JComboBox(mon);
                    months.setBounds(220,400,60,30);

                    String Year[]={"2021","2022"};
                    JComboBox year=new JComboBox(Year);
                    year.setBounds(290,400,60,30);

                    //Check_out

                    JLabel Check_out=new JLabel("Check_Out_Date:");
                    Check_out.setBounds(40,410,130,100);

                    String date_exit[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates_exit = new JComboBox(date_exit);
                    dates_exit.setBounds(170, 450, 40, 30);

                    String mon_exit[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months_exit=new JComboBox(mon_exit);
                    months_exit.setBounds(220,450,60,30);

                    String Year_exit[]={"2021","2022"};
                    JComboBox year_exit=new JComboBox(Year_exit);
                    year_exit.setBounds(290,450,60,30);

                    ButtonGroup bg;


                    //Room Preference
                    JLabel R_Prefernce=new JLabel("Room Prefernce");
                    R_Prefernce.setBounds(40,480,100,100);
                    JRadioButton Stand = new JRadioButton("Standard");
                    Stand.setBounds(160, 515, 100, 30);
                    frame.add(Stand);

                    JRadioButton Del = new JRadioButton("Deluxe");
                    Del.setBounds(260, 515, 90, 30);
                    frame.add(Del);

                    JRadioButton Suite = new JRadioButton("Suite");
                    Suite.setBounds(350, 515, 90, 30);
                    frame.add(Suite);

                    bg = new ButtonGroup();
                    bg.add(Stand);
                    bg.add(Del);
                    bg.add(Suite);


//Payment Method

                    JLabel payment=new JLabel("Payment Method");
                    payment.setBounds(40,535,130,100);

                    JRadioButton r1 = new JRadioButton("Credit Card");
                    r1.setBounds(170, 570, 100, 20);
                    frame.add(r1);
                    bg = new ButtonGroup();
                    bg.add(r1);
                    r1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f4=new JFrame("Card Details");
                            String name=JOptionPane.showInputDialog(f4,"Enter Credit_Card num:");

                        }
                    });
//Clear Button

                    JButton button1 = new JButton("Confirm");
                    button1.setBounds(120, 620, 100, 30);
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f5=new JFrame("Confirm Message");

                            f5.setSize(500, 400);
                            f5.setLocationRelativeTo(null);
                            f5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                            f5.setVisible(true);
                            f5.setLayout(new BorderLayout());
                            f5.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\ Reserved.jpg")));
                            f5.setLayout(new FlowLayout());
                            f5.setVisible(true);
                        }
                    });
                    JButton button2 = new JButton("Cancel");
                    button2.setBounds(240, 620, 110, 30);
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    frame.add(button1);
                    frame.add(button2);
//Frame Setting
                    frame.setLayout(null);
                    frame.setSize(600, 800);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                    //Addding to the Panel
                    frame.getContentPane().add(title);
                    frame.getContentPane().add(reservation);
                    frame.getContentPane().add(f_name);
                    frame.getContentPane().add(name);
                    frame.getContentPane().add(l_name);
                    frame.getContentPane().add(last_name);
                    frame.getContentPane().add(cnic);
                    frame.getContentPane().add(cnic_no);
                    frame.getContentPane().add(email);
                    frame.getContentPane().add(email_text);
                    frame.getContentPane().add(phone_no);
                    frame.getContentPane().add(phone_text);
                    frame.getContentPane().add(residence);
                    frame.getContentPane().add(residence_text);

                    frame.getContentPane().add(state);
                    frame.getContentPane().add(state_text);

                    frame.getContentPane().add(zipcode);
                    frame.getContentPane().add(zipcode_text);

                    //check_iN
                    frame.getContentPane().add(Check_in);
                    frame.getContentPane().add(dates);
                    frame.getContentPane().add(year);
                    frame.getContentPane().add(months);
                    //Check out
                    frame.getContentPane().add(Check_out);
                    frame.getContentPane().add(dates_exit);
                    frame.getContentPane().add(months_exit);
                    frame.getContentPane().add(year_exit);
                    frame.getContentPane().add(payment);
                    frame.getContentPane().add(R_Prefernce);

                }

                 });


            b5 = new JRadioButton("Delano Inn");
            b5.setBounds(300, 350, 200, 50);

            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    JFrame frame=new JFrame("Form");

                    frame.setSize(900, 900);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());
                    frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\image1.jpg")));
                    frame.setLayout(new FlowLayout());
                    frame.getContentPane().setBackground(Color.RED);

                    Font myfont;
                    JLabel title = new JLabel("DELANO INN");

                    title.setBounds(150,10,300,50);
                    title.setFont(new Font("Serif", Font.BOLD, 30));
                    title.setForeground(Color.BLACK);
                    frame.add(title);
                    JLabel reservation=new JLabel("Reservation Details");
                    reservation.setBounds(40,20,180,100);
                    // First Name

                    JLabel f_name = new JLabel(" First Name");
                    f_name.setBounds(40, 60, 80, 100);

                    JTextField name = new JTextField();
                    name.setBounds(40, 120, 160, 30);
                    //Last_Name
                    JLabel l_name = new JLabel("Last Name");
                    l_name.setBounds(250, 60, 100, 100);

                    JTextField last_name= new JTextField();
                    last_name.setBounds(250, 120, 160, 30);

                    //CNIC
                    JLabel cnic=new JLabel("CNIC");
                    cnic.setBounds(40,130,280,100);
                    JTextField cnic_no=new JTextField();
                    cnic_no.setBounds(40, 195, 250, 30);
                    //Email

                    JLabel email = new JLabel("Email Address");
                    email.setBounds(40, 205, 100, 100);
                    JTextField email_text = new JTextField();
                    email_text.setBounds(40, 270, 160, 30);

                    //Phone no

                    JLabel phone_no = new JLabel("Phone_no");
                    phone_no.setBounds(250, 205, 100, 100);
                    JTextField phone_text = new JTextField();
                    phone_text.setBounds(250, 270, 160, 30);

                    phone_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = phone_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                phone_text.setEditable(true);
                            } else {
                                phone_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "Enter only numeric digits(0-9)");
                            }
                        }
                    });



                    //Region of residence

                    JLabel residence=new JLabel("Region of Residence");
                    residence.setBounds(40,285,140,100);
                    JTextField residence_text=new JTextField();
                    residence_text.setBounds(40,350,140,30);
                    //State
                    JLabel state=new JLabel("State");
                    state.setBounds(200,285,100,100);
                    JTextField state_text=new JTextField();
                    state_text.setBounds(200,350,100,30);

                    //Zipcode

                    JLabel zipcode=new JLabel("Zip Code");
                    zipcode.setBounds(310,285,100,100);
                    JTextField zipcode_text=new JTextField();
                    zipcode_text.setBounds(310,350,100,30);

                    zipcode_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = zipcode_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                zipcode_text.setEditable(true);
                            } else {
                                zipcode_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "*Enter only Numeric digits");
                            }
                        }
                    });

                    //Check in:
                    JLabel Check_in=new JLabel("Check_in_Date:");
                    Check_in.setBounds(40,370,130,100);

                    String date[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates = new JComboBox(date);
                    dates.setBounds(170, 400, 40, 30);

                    String mon[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months=new JComboBox(mon);
                    months.setBounds(220,400,60,30);

                    String Year[]={"2021","2022"};
                    JComboBox year=new JComboBox(Year);
                    year.setBounds(290,400,60,30);

                    //Check_out

                    JLabel Check_out=new JLabel("Check_Out_Date:");
                    Check_out.setBounds(40,410,130,100);

                    String date_exit[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates_exit = new JComboBox(date_exit);
                    dates_exit.setBounds(170, 450, 40, 30);

                    String mon_exit[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months_exit=new JComboBox(mon_exit);
                    months_exit.setBounds(220,450,60,30);

                    String Year_exit[]={"2021","2022"};
                    JComboBox year_exit=new JComboBox(Year_exit);
                    year_exit.setBounds(290,450,60,30);

                    ButtonGroup bg;


                    //Room Preference
                    JLabel R_Prefernce=new JLabel("Room Prefernce");
                    R_Prefernce.setBounds(40,480,100,100);
                    JRadioButton Stand = new JRadioButton("Standard");
                    Stand.setBounds(160, 515, 100, 30);
                    frame.add(Stand);

                    JRadioButton Del = new JRadioButton("Deluxe");
                    Del.setBounds(260, 515, 90, 30);
                    frame.add(Del);

                    JRadioButton Suite = new JRadioButton("Suite");
                    Suite.setBounds(350, 515, 90, 30);
                    frame.add(Suite);
                    bg = new ButtonGroup();
                    bg.add(Stand);
                    bg.add(Del);
                    bg.add(Suite);


//Payment Method

                    JLabel payment=new JLabel("Payment Method");
                    payment.setBounds(40,535,130,100);

                    JRadioButton r1 = new JRadioButton("Credit Card");
                    r1.setBounds(170, 570, 100, 20);
                    frame.add(r1);
                    bg = new ButtonGroup();
                    bg.add(r1);
                    r1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f4=new JFrame("Card Details");
                            String name=JOptionPane.showInputDialog(f4,"Enter Credit_Card num:");

                        }
                    });
//Clear Button

                    JButton button1 = new JButton("Confirm");
                    button1.setBounds(120, 620, 100, 30);
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f5=new JFrame("Confirm Message");

                            f5.setSize(500,400);
                            f5.setLocationRelativeTo(null);
                            f5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                            f5.setVisible(true);
                            f5.setLayout(new BorderLayout());
                            f5.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\Reserved.jpg")));
                            f5.setLayout(new FlowLayout());
                            f5.setVisible(true);
                        }
                    });
                    JButton button2 = new JButton("Cancel");
                    button2.setBounds(240, 620, 110, 30);
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    frame.add(button1);
                    frame.add(button2);
//Frame Setting
                    frame.setLayout(null);
                    frame.setSize(600, 800);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                    //Addding to the Panel
                    frame.getContentPane().add(title);
                    frame.getContentPane().add(reservation);
                    frame.getContentPane().add(f_name);
                    frame.getContentPane().add(name);
                    frame.getContentPane().add(l_name);
                    frame.getContentPane().add(last_name);
                    frame.getContentPane().add(cnic);
                    frame.getContentPane().add(cnic_no);
                    frame.getContentPane().add(email);
                    frame.getContentPane().add(email_text);
                    frame.getContentPane().add(phone_no);
                    frame.getContentPane().add(phone_text);
                    frame.getContentPane().add(residence);
                    frame.getContentPane().add(residence_text);
                    frame.getContentPane().add(state);
                    frame.getContentPane().add(state_text);
                    frame.getContentPane().add(zipcode);
                    frame.getContentPane().add(zipcode_text);
                    //check_iN
                    frame.getContentPane().add(Check_in);
                    frame.getContentPane().add(dates);
                    frame.getContentPane().add(year);
                    frame.getContentPane().add(months);
                    //Check out
                    frame.getContentPane().add(Check_out);
                    frame.getContentPane().add(dates_exit);
                    frame.getContentPane().add(months_exit);
                    frame.getContentPane().add(year_exit);
                    frame.getContentPane().add(payment);
                    frame.getContentPane().add(R_Prefernce);

                }

                 });

            b6 = new JRadioButton("Serene Residence");
            b6.setBounds(500, 350, 150, 50);
            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    JFrame frame=new JFrame("Form");

                    frame.setSize(900, 900);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());
                    frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\image1.jpg")));
                    frame.setLayout(new FlowLayout());
                    frame.getContentPane().setBackground(Color.RED);

                    Font myfont;
                    JLabel title = new JLabel("SERENE RESIDENCE");

                    title.setBounds(150,10,300,50);
                    title.setFont(new Font("Serif", Font.ITALIC, 30));
                    title.setForeground(Color.BLACK);
                    frame.add(title);
                    JLabel reservation=new JLabel("Reservation Details");
                    reservation.setBounds(40,20,180,100);
                    // First Name

                    JLabel f_name = new JLabel(" First Name");
                    f_name.setBounds(40, 60, 80, 100);

                    JTextField name = new JTextField();
                    name.setBounds(40, 120, 160, 30);
                    //Last_Name
                    JLabel l_name = new JLabel("Last Name");
                    l_name.setBounds(250, 60, 100, 100);

                    JTextField last_name= new JTextField();
                    last_name.setBounds(250, 120, 160, 30);

                    //CNIC
                    JLabel cnic=new JLabel("CNIC");
                    cnic.setBounds(40,130,280,100);
                    JTextField cnic_no=new JTextField();
                    cnic_no.setBounds(40, 195, 250, 30);
                    //Email

                    JLabel email = new JLabel("Email Address");
                    email.setBounds(40, 205, 100, 100);
                    JTextField email_text = new JTextField();
                    email_text.setBounds(40, 270, 160, 30);

                    //Phone no

                    JLabel phone_no = new JLabel("Phone_no");
                    phone_no.setBounds(250, 205, 100, 100);
                    JTextField phone_text = new JTextField();
                    phone_text.setBounds(250, 270, 160, 30);

                    phone_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = phone_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                phone_text.setEditable(true);
                            } else {
                                phone_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "Enter only numeric digits(0-9)");
                            }
                        }
                    });


                    //Region of residence

                    JLabel residence=new JLabel("Region of Residence");
                    residence.setBounds(40,285,140,100);
                    JTextField residence_text=new JTextField();
                    residence_text.setBounds(40,350,140,30);
                    //State
                    JLabel state=new JLabel("State");
                    state.setBounds(200,285,100,100);
                    JTextField state_text=new JTextField();
                    state_text.setBounds(200,350,100,30);

                    //Zipcode

                    JLabel zipcode=new JLabel("Zip Code");
                    zipcode.setBounds(310,285,100,100);
                    JTextField zipcode_text=new JTextField();
                    zipcode_text.setBounds(310,350,100,30);

                    zipcode_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = zipcode_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                zipcode_text.setEditable(true);
                            } else {
                                zipcode_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "*Enter only Numeric digits");
                            }
                        }
                    });

                    //Check in:
                    JLabel Check_in=new JLabel("Check_in_Date:");
                    Check_in.setBounds(40,370,130,100);

                    String date[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates = new JComboBox(date);
                    dates.setBounds(170, 400, 40, 30);

                    String mon[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months=new JComboBox(mon);
                    months.setBounds(220,400,60,30);

                    String Year[]={"2021","2022"};
                    JComboBox year=new JComboBox(Year);
                    year.setBounds(290,400,60,30);

                    //Check_out

                    JLabel Check_out=new JLabel("Check_Out_Date:");
                    Check_out.setBounds(40,410,130,100);

                    String date_exit[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates_exit = new JComboBox(date_exit);
                    dates_exit.setBounds(170, 450, 40, 30);

                    String mon_exit[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months_exit=new JComboBox(mon_exit);
                    months_exit.setBounds(220,450,60,30);

                    String Year_exit[]={"2021","2022"};
                    JComboBox year_exit=new JComboBox(Year_exit);
                    year_exit.setBounds(290,450,60,30);

                    ButtonGroup bg;


                    //Room Preference
                    JLabel R_Prefernce=new JLabel("Room Prefernce");
                    R_Prefernce.setBounds(40,480,100,100);
                    JRadioButton Stand = new JRadioButton("Standard");
                    Stand.setBounds(160, 515, 100, 30);
                    frame.add(Stand);

                    JRadioButton Del = new JRadioButton("Deluxe");
                    Del.setBounds(260, 515, 90, 30);
                    frame.add(Del);

                    JRadioButton Suite = new JRadioButton("Suite");
                    Suite.setBounds(350, 515, 90, 30);
                    frame.add(Suite);

                    bg = new ButtonGroup();
                    bg.add(Stand);
                    bg.add(Del);
                    bg.add(Suite);


//Payment Method

                    JLabel payment=new JLabel("Payment Method");
                    payment.setBounds(40,535,130,100);

                    JRadioButton r1 = new JRadioButton("Credit Card");
                    r1.setBounds(170, 570, 100, 20);
                    frame.add(r1);
                    bg = new ButtonGroup();
                    bg.add(r1);
                    r1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f4=new JFrame("Card Details");
                            String name=JOptionPane.showInputDialog(f4,"Enter Credit_Card num:");

                        }
                    });
//Clear Button

                    JButton button1 = new JButton("Confirm");
                    button1.setBounds(120, 620, 100, 30);
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f5=new JFrame("Confirm Message");

                            f5.setSize(500, 400);
                            f5.setLocationRelativeTo(null);
                            f5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                            f5.setVisible(true);
                            f5.setLayout(new BorderLayout());
                            f5.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\Reserved.jpg")));
                            f5.setLayout(new FlowLayout());
                            f5.setVisible(true);
                        }
                    });
                    JButton button2 = new JButton("Cancel");
                    button2.setBounds(240, 620, 110, 30);
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    frame.add(button1);
                    frame.add(button2);
//Frame Setting
                    frame.setLayout(null);
                    frame.setSize(600, 800);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                    //Addding to the Panel
                    frame.getContentPane().add(title);
                    frame.getContentPane().add(reservation);
                    frame.getContentPane().add(f_name);
                    frame.getContentPane().add(name);
                    frame.getContentPane().add(l_name);
                    frame.getContentPane().add(last_name);
                    frame.getContentPane().add(cnic);
                    frame.getContentPane().add(cnic_no);
                    frame.getContentPane().add(email);
                    frame.getContentPane().add(email_text);
                    frame.getContentPane().add(phone_no);
                    frame.getContentPane().add(phone_text);
                    frame.getContentPane().add(residence);
                    frame.getContentPane().add(residence_text);

                    frame.getContentPane().add(state);
                    frame.getContentPane().add(state_text);

                    frame.getContentPane().add(zipcode);
                    frame.getContentPane().add(zipcode_text);

                    //check_iN
                    frame.getContentPane().add(Check_in);
                    frame.getContentPane().add(dates);
                    frame.getContentPane().add(year);
                    frame.getContentPane().add(months);
                    //Check out
                    frame.getContentPane().add(Check_out);
                    frame.getContentPane().add(dates_exit);
                    frame.getContentPane().add(months_exit);
                    frame.getContentPane().add(year_exit);
                    frame.getContentPane().add(payment);
                    frame.getContentPane().add(R_Prefernce);

                }


                 });

            b7 = new JRadioButton("Hotel Crown Plaza");
            b7.setBounds(300, 400, 200, 50);

            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    JFrame frame = new JFrame("Form");

                    frame.setSize(900, 900);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());
                    frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\image1.jpg")));
                    frame.setLayout(new FlowLayout());
                    frame.getContentPane().setBackground(Color.RED);

                    Font myfont;
                    JLabel title = new JLabel("HOTEL CROWN PLAZA");

                    title.setBounds(150, 10, 300, 50);
                    title.setFont(new Font("Serif", Font.ITALIC, 30));
                    title.setForeground(Color.BLACK);
                    frame.add(title);
                    JLabel reservation = new JLabel("Reservation Details");
                    reservation.setBounds(40, 20, 180, 100);
                    // First Name

                    JLabel f_name = new JLabel(" First Name");
                    f_name.setBounds(40, 60, 80, 100);

                    JTextField name = new JTextField();
                    name.setBounds(40, 120, 160, 30);
                    //Last_Name
                    JLabel l_name = new JLabel("Last Name");
                    l_name.setBounds(250, 60, 100, 100);

                    JTextField last_name = new JTextField();
                    last_name.setBounds(250, 120, 160, 30);

                    //CNIC
                    JLabel cnic = new JLabel("CNIC");
                    cnic.setBounds(40, 130, 280, 100);
                    JTextField cnic_no = new JTextField();
                    cnic_no.setBounds(40, 195, 250, 30);
                    //Email

                    JLabel email = new JLabel("Email Address");
                    email.setBounds(40, 205, 100, 100);
                    JTextField email_text = new JTextField();
                    email_text.setBounds(40, 270, 160, 30);

                    //Phone no

                    JLabel phone_no = new JLabel("Phone_no");
                    phone_no.setBounds(250, 205, 100, 100);
                    JTextField phone_text = new JTextField();
                    phone_text.setBounds(250, 270, 160, 30);

                    phone_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = phone_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                phone_text.setEditable(true);
                            } else {
                                phone_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "Enter only numeric digits(0-9)");
                            }
                        }
                    });


                    //Region of residence

                    JLabel residence = new JLabel("Region of Residence");
                    residence.setBounds(40, 285, 140, 100);
                    JTextField residence_text = new JTextField();
                    residence_text.setBounds(40, 350, 140, 30);
                    //State
                    JLabel state = new JLabel("State");
                    state.setBounds(200, 285, 100, 100);
                    JTextField state_text = new JTextField();
                    state_text.setBounds(200, 350, 100, 30);

                    //Zipcode

                    JLabel zipcode = new JLabel("Zip Code");
                    zipcode.setBounds(310, 285, 100, 100);
                    JTextField zipcode_text = new JTextField();
                    zipcode_text.setBounds(310, 350, 100, 30);

                    zipcode_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = zipcode_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                zipcode_text.setEditable(true);
                            } else {
                                zipcode_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "*Enter only Numeric digits");
                            }
                        }
                    });

                    //Check in:
                    JLabel Check_in = new JLabel("Check_in_Date:");
                    Check_in.setBounds(40, 370, 130, 100);

                    String date[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
                            "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
                            "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
                    JComboBox dates = new JComboBox(date);
                    dates.setBounds(170, 400, 40, 30);

                    String mon[] = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
                    JComboBox months = new JComboBox(mon);
                    months.setBounds(220, 400, 60, 30);

                    String Year[] = {"2021", "2022"};
                    JComboBox year = new JComboBox(Year);
                    year.setBounds(290, 400, 60, 30);

                    //Check_out

                    JLabel Check_out = new JLabel("Check_Out_Date:");
                    Check_out.setBounds(40, 410, 130, 100);

                    String date_exit[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
                            "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
                            "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
                    JComboBox dates_exit = new JComboBox(date_exit);
                    dates_exit.setBounds(170, 450, 40, 30);

                    String mon_exit[] = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
                    JComboBox months_exit = new JComboBox(mon_exit);
                    months_exit.setBounds(220, 450, 60, 30);

                    String Year_exit[] = {"2021", "2022"};
                    JComboBox year_exit = new JComboBox(Year_exit);
                    year_exit.setBounds(290, 450, 60, 30);

                    ButtonGroup bg;


                    //Room Preference
                    JLabel R_Prefernce = new JLabel("Room Prefernce");
                    R_Prefernce.setBounds(40, 480, 100, 100);
                    JRadioButton Stand = new JRadioButton("Standard");
                    Stand.setBounds(160, 515, 100, 30);
                    frame.add(Stand);

                    JRadioButton Del = new JRadioButton("Deluxe");
                    Del.setBounds(260, 515, 90, 30);
                    frame.add(Del);

                    JRadioButton Suite = new JRadioButton("Suite");
                    Suite.setBounds(350, 515, 90, 30);
                    frame.add(Suite);

                    bg = new ButtonGroup();
                    bg.add(Stand);
                    bg.add(Del);
                    bg.add(Suite);


//Payment Method

                    JLabel payment = new JLabel("Payment Method");
                    payment.setBounds(40, 535, 130, 100);

                    JRadioButton r1 = new JRadioButton("Credit Card");
                    r1.setBounds(170, 570, 100, 20);
                    frame.add(r1);
                    bg = new ButtonGroup();
                    bg.add(r1);
                    r1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f4 = new JFrame("Card Details");
                            String name = JOptionPane.showInputDialog(f4, "Enter Credit_Card num:");

                        }
                    });
//Clear Button

                    JButton button1 = new JButton("Confirm");
                    button1.setBounds(120, 620, 100, 30);
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f5 = new JFrame("Confirm Message");

                            f5.setSize(500, 400);
                            f5.setLocationRelativeTo(null);
                            f5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                            f5.setVisible(true);
                            f5.setLayout(new BorderLayout());
                            f5.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\Reserved.jpg")));
                            f5.setLayout(new FlowLayout());
                            f5.setVisible(true);
                        }
                    });
                    JButton button2 = new JButton("Cancel");
                    button2.setBounds(240, 620, 110, 30);
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    frame.add(button1);
                    frame.add(button2);
//Frame Setting
                    frame.setLayout(null);
                    frame.setSize(600, 800);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                    //Addding to the Panel
                    frame.getContentPane().add(title);
                    frame.getContentPane().add(reservation);
                    frame.getContentPane().add(f_name);
                    frame.getContentPane().add(name);
                    frame.getContentPane().add(l_name);
                    frame.getContentPane().add(last_name);
                    frame.getContentPane().add(cnic);
                    frame.getContentPane().add(cnic_no);
                    frame.getContentPane().add(email);
                    frame.getContentPane().add(email_text);
                    frame.getContentPane().add(phone_no);
                    frame.getContentPane().add(phone_text);
                    frame.getContentPane().add(residence);
                    frame.getContentPane().add(residence_text);

                    frame.getContentPane().add(state);
                    frame.getContentPane().add(state_text);

                    frame.getContentPane().add(zipcode);
                    frame.getContentPane().add(zipcode_text);

                    //check_iN
                    frame.getContentPane().add(Check_in);
                    frame.getContentPane().add(dates);
                    frame.getContentPane().add(year);
                    frame.getContentPane().add(months);
                    //Check out
                    frame.getContentPane().add(Check_out);
                    frame.getContentPane().add(dates_exit);
                    frame.getContentPane().add(months_exit);
                    frame.getContentPane().add(year_exit);
                    frame.getContentPane().add(payment);
                    frame.getContentPane().add(R_Prefernce);

                }
                } );

            b8 = new JRadioButton("Hotel One Jinnah");
            b8.setBounds(500, 400, 150, 50);

            b8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {



                    JFrame frame=new JFrame("Form");

                    frame.setSize(900, 900);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());
                    frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\image1.jpg")));
                    frame.setLayout(new FlowLayout());
                    frame.getContentPane().setBackground(Color.RED);

                    Font myfont;
                    JLabel title = new JLabel("HOTEL ONE JINNAH");

                    title.setBounds(150,10,350,50);
                    title.setFont(new Font("Serif", Font.BOLD, 30));
                    title.setForeground(Color.BLACK);
                    frame.add(title);
                    JLabel reservation=new JLabel("Reservation Details");
                    reservation.setBounds(40,20,180,100);
                    // First Name

                    JLabel f_name = new JLabel(" First Name");
                    f_name.setBounds(40, 60, 80, 100);

                    JTextField name = new JTextField();
                    name.setBounds(40, 120, 160, 30);
                    //Last_Name
                    JLabel l_name = new JLabel("Last Name");
                    l_name.setBounds(250, 60, 100, 100);

                    JTextField last_name= new JTextField();
                    last_name.setBounds(250, 120, 160, 30);

                    //CNIC
                    JLabel cnic=new JLabel("CNIC");
                    cnic.setBounds(40,130,280,100);
                    JTextField cnic_no=new JTextField();
                    cnic_no.setBounds(40, 195, 250, 30);
                    //Email

                    JLabel email = new JLabel("Email Address");
                    email.setBounds(40, 205, 100, 100);
                    JTextField email_text = new JTextField();
                    email_text.setBounds(40, 270, 160, 30);

                    //Phone no

                    JLabel phone_no = new JLabel("Phone_no");
                    phone_no.setBounds(250, 205, 100, 100);
                    JTextField phone_text = new JTextField();
                    phone_text.setBounds(250, 270, 160, 30);

                    phone_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = phone_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                phone_text.setEditable(true);
                            } else {
                                phone_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "Enter only numeric digits(0-9)");
                            }
                        }
                    });


                    //Region of residence

                    JLabel residence=new JLabel("Region of Residence");
                    residence.setBounds(40,285,140,100);
                    JTextField residence_text=new JTextField();
                    residence_text.setBounds(40,350,140,30);
                    //State
                    JLabel state=new JLabel("State");
                    state.setBounds(200,285,100,100);
                    JTextField state_text=new JTextField();
                    state_text.setBounds(200,350,100,30);

                    //Zipcode

                    JLabel zipcode=new JLabel("Zip Code");
                    zipcode.setBounds(310,285,100,100);
                    JTextField zipcode_text=new JTextField();
                    zipcode_text.setBounds(310,350,100,30);

                    zipcode_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = zipcode_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                zipcode_text.setEditable(true);
                            } else {
                                zipcode_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "*Enter only Numeric digits");
                            }
                        }
                    });

                    //Check in:
                    JLabel Check_in=new JLabel("Check_in_Date:");
                    Check_in.setBounds(40,370,130,100);

                    String date[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates = new JComboBox(date);
                    dates.setBounds(170, 400, 40, 30);

                    String mon[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months=new JComboBox(mon);
                    months.setBounds(220,400,60,30);

                    String Year[]={"2021","2022"};
                    JComboBox year=new JComboBox(Year);
                    year.setBounds(290,400,60,30);

                    //Check_out

                    JLabel Check_out=new JLabel("Check_Out_Date:");
                    Check_out.setBounds(40,410,130,100);

                    String date_exit[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates_exit = new JComboBox(date_exit);
                    dates_exit.setBounds(170, 450, 40, 30);

                    String mon_exit[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months_exit=new JComboBox(mon_exit);
                    months_exit.setBounds(220,450,60,30);

                    String Year_exit[]={"2021","2022"};
                    JComboBox year_exit=new JComboBox(Year_exit);
                    year_exit.setBounds(290,450,60,30);

                    ButtonGroup bg;


                    //Room Preference
                    JLabel R_Prefernce=new JLabel("Room Prefernce");
                    R_Prefernce.setBounds(40,480,100,100);
                    JRadioButton Stand = new JRadioButton("Standard");
                    Stand.setBounds(160, 515, 100, 30);
                    frame.add(Stand);

                    JRadioButton Del = new JRadioButton("Deluxe");
                    Del.setBounds(260, 515, 90, 30);
                    frame.add(Del);

                    JRadioButton Suite = new JRadioButton("Suite");
                    Suite.setBounds(350, 515, 90, 30);
                    frame.add(Suite);

                    bg = new ButtonGroup();
                    bg.add(Stand);
                    bg.add(Del);
                    bg.add(Suite);


//Payment Method

                    JLabel payment=new JLabel("Payment Method");
                    payment.setBounds(40,535,130,100);

                    JRadioButton r1 = new JRadioButton("Credit Card");
                    r1.setBounds(170, 570, 100, 20);
                    frame.add(r1);
                    bg = new ButtonGroup();
                    bg.add(r1);
                    r1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f4=new JFrame("Card Details");
                            String name=JOptionPane.showInputDialog(f4,"Enter Credit_Card num:");

                        }
                    });
//Clear Button

                    JButton button1 = new JButton("Confirm");
                    button1.setBounds(120, 620, 100, 30);
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f5=new JFrame("Confirm Message");

                            f5.setSize(500,400);
                            f5.setLocationRelativeTo(null);
                            f5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                            f5.setVisible(true);
                            f5.setLayout(new BorderLayout());
                            f5.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\Reserved.jpg")));
                            f5.setLayout(new FlowLayout());
                            f5.setVisible(true);
                        }
                    });
                    JButton button2 = new JButton("Cancel");
                    button2.setBounds(240, 620, 110, 30);
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    frame.add(button1);
                    frame.add(button2);
//Frame Setting
                    frame.setLayout(null);
                    frame.setSize(600, 800);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                    //Addding to the Panel
                    frame.getContentPane().add(title);
                    frame.getContentPane().add(reservation);
                    frame.getContentPane().add(f_name);
                    frame.getContentPane().add(name);
                    frame.getContentPane().add(l_name);
                    frame.getContentPane().add(last_name);
                    frame.getContentPane().add(cnic);
                    frame.getContentPane().add(cnic_no);
                    frame.getContentPane().add(email);
                    frame.getContentPane().add(email_text);
                    frame.getContentPane().add(phone_no);
                    frame.getContentPane().add(phone_text);
                    frame.getContentPane().add(residence);
                    frame.getContentPane().add(residence_text);

                    frame.getContentPane().add(state);
                    frame.getContentPane().add(state_text);

                    frame.getContentPane().add(zipcode);
                    frame.getContentPane().add(zipcode_text);
                    //check_iN
                    frame.getContentPane().add(Check_in);
                    frame.getContentPane().add(dates);
                    frame.getContentPane().add(year);
                    frame.getContentPane().add(months);
                    //Check out
                    frame.getContentPane().add(Check_out);
                    frame.getContentPane().add(dates_exit);
                    frame.getContentPane().add(months_exit);
                    frame.getContentPane().add(year_exit);
                    frame.getContentPane().add(payment);
                    frame.getContentPane().add(R_Prefernce);

                }

                 });

            b9 = new JRadioButton("Hotel Islamabad");
            b9.setBounds(300, 450, 200, 50);

            b9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    JFrame frame=new JFrame("Form");

                    frame.setSize(900, 900);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());
                    frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\image1.jpg")));
                    frame.setLayout(new FlowLayout());
                    frame.getContentPane().setBackground(Color.RED);

                    Font myfont;
                    JLabel title = new JLabel("HOTEL  ISLAMABAD");

                    title.setBounds(150,10,300,50);
                    title.setFont(new Font("Serif", Font.ITALIC, 30));
                    title.setForeground(Color.BLACK);
                    frame.add(title);
                    JLabel reservation=new JLabel("Reservation Details");
                    reservation.setBounds(40,20,180,100);
                    // First Name

                    JLabel f_name = new JLabel(" First Name");
                    f_name.setBounds(40, 60, 80, 100);

                    JTextField name = new JTextField();
                    name.setBounds(40, 120, 160, 30);
                    //Last_Name
                    JLabel l_name = new JLabel("Last Name");
                    l_name.setBounds(250, 60, 100, 100);

                    JTextField last_name= new JTextField();
                    last_name.setBounds(250, 120, 160, 30);

                    //CNIC
                    JLabel cnic=new JLabel("CNIC");
                    cnic.setBounds(40,130,280,100);
                    JTextField cnic_no=new JTextField();
                    cnic_no.setBounds(40, 195, 250, 30);
                    //Email

                    JLabel email = new JLabel("Email Address");
                    email.setBounds(40, 205, 100, 100);
                    JTextField email_text = new JTextField();
                    email_text.setBounds(40, 270, 160, 30);

                    //Phone no

                    JLabel phone_no = new JLabel("Phone_no");
                    phone_no.setBounds(250, 205, 100, 100);
                    JTextField phone_text = new JTextField();
                    phone_text.setBounds(250, 270, 160, 30);

                    phone_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = phone_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                phone_text.setEditable(true);
                            } else {
                                phone_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "Enter only numeric digits(0-9)");
                            }
                        }
                    });

                    //Region of residence

                    JLabel residence=new JLabel("Region of Residence");
                    residence.setBounds(40,285,140,100);
                    JTextField residence_text=new JTextField();
                    residence_text.setBounds(40,350,140,30);
                    //State
                    JLabel state=new JLabel("State");
                    state.setBounds(200,285,100,100);
                    JTextField state_text=new JTextField();
                    state_text.setBounds(200,350,100,30);

                    //Zipcode

                    JLabel zipcode=new JLabel("Zip Code");
                    zipcode.setBounds(310,285,100,100);
                    JTextField zipcode_text=new JTextField();
                    zipcode_text.setBounds(310,350,100,30);

                    zipcode_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = zipcode_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                zipcode_text.setEditable(true);
                            } else {
                                zipcode_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "*Enter only Numeric digits");
                            }
                        }
                    });

                    //Check in:
                    JLabel Check_in=new JLabel("Check_in_Date:");
                    Check_in.setBounds(40,370,130,100);

                    String date[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates = new JComboBox(date);
                    dates.setBounds(170, 400, 40, 30);

                    String mon[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months=new JComboBox(mon);
                    months.setBounds(220,400,60,30);

                    String Year[]={"2021","2022"};
                    JComboBox year=new JComboBox(Year);
                    year.setBounds(290,400,60,30);

                    //Check_out

                    JLabel Check_out=new JLabel("Check_Out_Date:");
                    Check_out.setBounds(40,410,130,100);

                    String date_exit[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates_exit = new JComboBox(date_exit);
                    dates_exit.setBounds(170, 450, 40, 30);

                    String mon_exit[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months_exit=new JComboBox(mon_exit);
                    months_exit.setBounds(220,450,60,30);

                    String Year_exit[]={"2021","2022"};
                    JComboBox year_exit=new JComboBox(Year_exit);
                    year_exit.setBounds(290,450,60,30);

                    ButtonGroup bg;


                    //Room Preference
                    JLabel R_Prefernce=new JLabel("Room Prefernce");
                    R_Prefernce.setBounds(40,480,100,100);
                    JRadioButton Stand = new JRadioButton("Standard");
                    Stand.setBounds(160, 515, 100, 30);
                    frame.add(Stand);

                    JRadioButton Del = new JRadioButton("Deluxe");
                    Del.setBounds(260, 515, 90, 30);
                    frame.add(Del);

                    JRadioButton Suite = new JRadioButton("Suite");
                    Suite.setBounds(350, 515, 90, 30);
                    frame.add(Suite);

                    bg = new ButtonGroup();
                    bg.add(Stand);
                    bg.add(Del);
                    bg.add(Suite);


//Payment Method

                    JLabel payment=new JLabel("Payment Method");
                    payment.setBounds(40,535,130,100);

                    JRadioButton r1 = new JRadioButton("Credit Card");
                    r1.setBounds(170, 570, 100, 20);
                    frame.add(r1);
                    bg = new ButtonGroup();
                    bg.add(r1);
                    r1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f4=new JFrame("Card Details");
                            String name=JOptionPane.showInputDialog(f4,"Enter Credit_Card num:");

                        }
                    });
//Clear Button

                    JButton button1 = new JButton("Confirm");
                    button1.setBounds(120, 620, 100, 30);
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f5=new JFrame("Confirm Message");

                            f5.setSize(500, 400);
                            f5.setLocationRelativeTo(null);
                            f5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                            f5.setVisible(true);
                            f5.setLayout(new BorderLayout());
                            f5.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\Reserved.jpg")));
                            f5.setLayout(new FlowLayout());
                            f5.setVisible(true);
                        }
                    });


                    JButton button2 = new JButton("Cancel");
                    button2.setBounds(240, 620, 110, 30);
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    frame.add(button1);
                    frame.add(button2);
//Frame Setting
                    frame.setLayout(null);
                    frame.setSize(600, 800);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                    //Addding to the Panel
                    frame.getContentPane().add(title);
                    frame.getContentPane().add(reservation);
                    frame.getContentPane().add(f_name);
                    frame.getContentPane().add(name);
                    frame.getContentPane().add(l_name);
                    frame.getContentPane().add(last_name);
                    frame.getContentPane().add(cnic);
                    frame.getContentPane().add(cnic_no);
                    frame.getContentPane().add(email);
                    frame.getContentPane().add(email_text);
                    frame.getContentPane().add(phone_no);
                    frame.getContentPane().add(phone_text);
                    frame.getContentPane().add(residence);
                    frame.getContentPane().add(residence_text);
                    frame.getContentPane().add(state);
                    frame.getContentPane().add(state_text);
                    frame.getContentPane().add(zipcode);
                    frame.getContentPane().add(zipcode_text);

                    //check_iN
                    frame.getContentPane().add(Check_in);
                    frame.getContentPane().add(dates);
                    frame.getContentPane().add(year);
                    frame.getContentPane().add(months);
                    //Check out
                    frame.getContentPane().add(Check_out);
                    frame.getContentPane().add(dates_exit);
                    frame.getContentPane().add(months_exit);
                    frame.getContentPane().add(year_exit);
                    frame.getContentPane().add(payment);
                    frame.getContentPane().add(R_Prefernce);

                }

                } );

            b10 = new JRadioButton("Envoy Contential Hotel");
            b10.setBounds(500, 450, 150, 50);
            b10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    JFrame frame=new JFrame("Form");

                    frame.setSize(900, 900);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());
                    frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\image1.jpg")));
                    frame.setLayout(new FlowLayout());
                    frame.getContentPane().setBackground(Color.RED);

                    Font myfont;
                    JLabel title = new JLabel("ENVOY CONTENTIAL HOTEL");

                    title.setBounds(150,10,300,50);
                    title.setFont(new Font("Serif", Font.ITALIC, 20));
                    title.setForeground(Color.BLACK);
                    frame.add(title);
                    JLabel reservation=new JLabel("Reservation Details");
                    reservation.setBounds(40,20,180,100);
                    // First Name

                    JLabel f_name = new JLabel(" First Name");
                    f_name.setBounds(40, 60, 80, 100);
                    JTextField name = new JTextField();
                    name.setBounds(40, 120, 160, 30);

                    //Last_Name
                    JLabel l_name = new JLabel("Last Name");
                    l_name.setBounds(250, 60, 100, 100);

                    JTextField last_name= new JTextField();
                    last_name.setBounds(250, 120, 160, 30);

                    //CNIC
                    JLabel cnic=new JLabel("CNIC");
                    cnic.setBounds(40,130,280,100);
                    JTextField cnic_no=new JTextField();
                    cnic_no.setBounds(40, 195, 250, 30);

                    //Email

                    JLabel email = new JLabel("Email Address");
                    email.setBounds(40, 205, 100, 100);
                    JTextField email_text = new JTextField();
                    email_text.setBounds(40, 270, 160, 30);


                    //Phone no

                    JLabel phone_no = new JLabel("Phone_no");
                    phone_no.setBounds(250, 205, 100, 100);
                    JTextField phone_text = new JTextField();
                    phone_text.setBounds(250, 270, 160, 30);

                    phone_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = phone_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                phone_text.setEditable(true);
                            } else {
                                phone_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "Enter");
                            }
                        }
                    });


                    //Region of residence

                    JLabel residence=new JLabel("Region of Residence");
                    residence.setBounds(40,285,140,100);
                    JTextField residence_text=new JTextField();
                    residence_text.setBounds(40,350,140,30);
                    //State
                    JLabel state=new JLabel("State");
                    state.setBounds(200,285,100,100);
                    JTextField state_text=new JTextField();
                    state_text.setBounds(200,350,100,30);

                    //Zipcode

                    JLabel zipcode=new JLabel("Zip Code");
                    zipcode.setBounds(310,285,100,100);
                    JTextField zipcode_text=new JTextField();
                    zipcode_text.setBounds(310,350,100,30);

                    zipcode_text.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            String value = zipcode_text.getText();
                            int l = value.length();
                            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                                zipcode_text.setEditable(true);
                            } else {
                                zipcode_text.setEditable(false);
                                JOptionPane.showMessageDialog(null, "*Enter only Numeric digits");
                            }
                        }
                    });

                    //Check in:
                    JLabel Check_in=new JLabel("Check_in_Date:");
                    Check_in.setBounds(40,370,130,100);

                    String date[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates = new JComboBox(date);
                    dates.setBounds(170, 400, 40, 30);

                    String mon[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months=new JComboBox(mon);
                    months.setBounds(220,400,60,30);

                    String Year[]={"2021","2022"};
                    JComboBox year=new JComboBox(Year);
                    year.setBounds(290,400,60,30);

                    //Check_out

                    JLabel Check_out=new JLabel("Check_Out_Date:");
                    Check_out.setBounds(40,410,130,100);

                    String date_exit[] = {"1","2","3","4","5","6","7","8","9",
                            "10","11","12","13","14","15","16","17","18","19","20","21",
                            "22","23","24","25","26","27","28","29","30","31"};
                    JComboBox dates_exit = new JComboBox(date_exit);
                    dates_exit.setBounds(170, 450, 40, 30);

                    String mon_exit[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
                    JComboBox months_exit=new JComboBox(mon_exit);
                    months_exit.setBounds(220,450,60,30);

                    String Year_exit[]={"2021","2022"};
                    JComboBox year_exit=new JComboBox(Year_exit);
                    year_exit.setBounds(290,450,60,30);

                    ButtonGroup bg;


                    //Room Preference
                    JLabel R_Prefernce=new JLabel("Room Prefernce");
                    R_Prefernce.setBounds(40,480,100,100);
                    JRadioButton Stand = new JRadioButton("Standard");
                    Stand.setBounds(160, 515, 100, 30);
                    frame.add(Stand);

                    JRadioButton Del = new JRadioButton("Deluxe");
                    Del.setBounds(260, 515, 90, 30);
                    frame.add(Del);

                    JRadioButton Suite = new JRadioButton("Suite");
                    Suite.setBounds(350, 515, 90, 30);
                    frame.add(Suite);

                    bg = new ButtonGroup();
                    bg.add(Stand);
                    bg.add(Del);
                    bg.add(Suite);


//Payment Method

                    JLabel payment=new JLabel("Payment Method");
                    payment.setBounds(40,535,130,100);

                    JRadioButton r1 = new JRadioButton("Credit Card");
                    r1.setBounds(170, 570, 100, 20);
                    frame.add(r1);
                    bg = new ButtonGroup();
                    bg.add(r1);
                    r1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f4=new JFrame("Card Details");
                            String name=JOptionPane.showInputDialog(f4,"Enter Credit_Card num:");


                        }
                    });
//Clear Button

                    JButton button1 = new JButton("Confirm");
                    button1.setBounds(120, 620, 100, 30);
                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame f5=new JFrame("Confirm Message");

                            f5.setSize(500, 400);
                            f5.setLocationRelativeTo(null);
                            f5.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                            f5.setVisible(true);
                            f5.setLayout(new BorderLayout());
                            f5.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Desktop\\Reserved.jpg")));


                            f5.setLayout(new FlowLayout());
                            f5.setVisible(true);
                        }
                    });
                    JButton button2 = new JButton("Cancel");
                    button2.setBounds(240, 620, 110, 30);
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    });
                    frame.add(button1);
                    frame.add(button2);
                    //Frame Setting
                    frame.setLayout(null);
                    frame.setSize(600, 800);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                    //Addding to the Panel
                    frame.getContentPane().add(title);
                    frame.getContentPane().add(reservation);
                    frame.getContentPane().add(f_name);
                    frame.getContentPane().add(name);
                    frame.getContentPane().add(l_name);
                    frame.getContentPane().add(last_name);
                    frame.getContentPane().add(cnic);
                    frame.getContentPane().add(cnic_no);
                    frame.getContentPane().add(email);
                    frame.getContentPane().add(email_text);
                    frame.getContentPane().add(phone_no);
                    frame.getContentPane().add(phone_text);
                    frame.getContentPane().add(residence);
                    frame.getContentPane().add(residence_text);
                    frame.getContentPane().add(state);
                    frame.getContentPane().add(state_text);
                    frame.getContentPane().add(zipcode);
                    frame.getContentPane().add(zipcode_text);

                    //check_iN
                    frame.getContentPane().add(Check_in);
                    frame.getContentPane().add(dates);
                    frame.getContentPane().add(year);
                    frame.getContentPane().add(months);
                    //Check out
                    frame.getContentPane().add(Check_out);
                    frame.getContentPane().add(dates_exit);
                    frame.getContentPane().add(months_exit);
                    frame.getContentPane().add(year_exit);
                    frame.getContentPane().add(payment);
                    frame.getContentPane().add(R_Prefernce);



                } });

            //Adding Buttons in Frame1
            frame1.add(b1);
            frame1.add(b2);
            frame1.add(b3);
            frame1.add(b4);
            frame1.add(b5);
            frame1.add(b6);
            frame1.add(b7);
            frame1.add(b8);
            frame1.add(b9);
            frame1.add(b10);
//Adding in One
            ButtonGroup bg = new ButtonGroup();
            bg.add(b1);
            bg.add(b2);
            bg.add(b3);
            bg.add(b4);
            bg.add(b5);
            bg.add(b6);
            bg.add(b7);
            bg.add(b8);
            bg.add(b9);
            bg.add(b10);

            addKeyListener(new KeyAdapter() {

                public void keyPressed(KeyEvent ex) {
                    if(ex.getSource()==b1){
                        JFrame f3=new JFrame("Frame");

                        f3.setVisible(true);
                        f3.setSize(200,200);
            }
                }
            }
            );

            //Frame1 Setting
            frame1.setLayout(new BorderLayout());
            frame1.setSize(850, 900);
            frame1.setVisible(true);
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }


        }//main ends here
