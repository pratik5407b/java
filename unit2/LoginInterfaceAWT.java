import java.awt.*;

public class LoginInterfaceAWT extends Frame {
    // Components
    Label lblUsername, lblPassword, lblOptions, lblGender, lblHobbies;
    TextField txtUsername, txtPassword;
    Button btnLogin, btnClear;
    Checkbox cbRememberMe;
    Choice choiceOptions;
    List listHobbies;
    ScrollPane scrollPaneHobbies;

    public LoginInterfaceAWT() {
        // Set frame properties
        setTitle("Login Interface");
        setSize(400, 500);
        setLayout(null); // Use absolute positioning


         MenuBar mb = new MenuBar();
        Menu filemenu = new Menu("File");

       

        MenuItem i1 = new MenuItem("New                  ctrl+N");
        Menu i2 = new Menu("Actions");
        MenuItem m= new MenuItem("cut");

        MenuItem m1= new MenuItem("copy");
        MenuItem m2= new MenuItem("paste");         
        i2.add(m);
        i2.add(m1);
        i2.add(m2);


        MenuItem i3 = new MenuItem("New Window        ctrl+shift+N");
        MenuItem i4 = new MenuItem("Open                    ctrl+O");
        MenuItem i9 = new MenuItem("Save                    ctrl+S");
        MenuItem i10 = new MenuItem("Save as             ctrl+shift+S");

        filemenu.add(i1);
        filemenu.add(i2);
        filemenu.add(i3);
        filemenu.add(i4);


       filemenu.add(i9);
       filemenu.add(i10);

        Menu editmenu = new Menu("Edit");

        MenuItem i5 = new MenuItem("Item 1");
        MenuItem i6 = new MenuItem("Item 2");
        MenuItem i7 = new MenuItem("Item 3");
        MenuItem i8 = new MenuItem("Item 4");
        
        editmenu.add(i5);
        editmenu.add(i6);
        editmenu.add(i7);
        editmenu.add(i8);

        mb.add(filemenu);
        mb.add(editmenu);
        this.setMenuBar(mb);

        // Initialize components with positions
        lblUsername = new Label("Username:");
        lblUsername.setBounds(50, 50, 80, 30);
        txtUsername = new TextField(20);
        txtUsername.setBounds(150, 50, 180, 30);

        lblPassword = new Label("Password:");
        lblPassword.setBounds(50, 100, 80, 30);
        txtPassword = new TextField(20);
        txtPassword.setBounds(150, 100, 180, 30);
        txtPassword.setEchoChar('*');

        cbRememberMe = new Checkbox("Remember Me");
        cbRememberMe.setBounds(150, 140, 100, 30);

        lblOptions = new Label("Country:");
        lblOptions.setBounds(50, 180, 80, 30);
        choiceOptions = new Choice();
        choiceOptions.setBounds(150, 180, 180, 30);
        choiceOptions.add("Nepal");
        choiceOptions.add("India");
        choiceOptions.add("China");

        lblGender = new Label("Gender:");
        lblGender.setBounds(50, 220, 80, 30);
        CheckboxGroup cbgGender = new CheckboxGroup();
        Checkbox cbMale = new Checkbox("Male", cbgGender, false);
        cbMale.setBounds(150, 220, 50, 30);
        Checkbox cbFemale = new Checkbox("Female", cbgGender, false);
        cbFemale.setBounds(210, 220, 70, 30);
        Checkbox cbOther = new Checkbox("Other", cbgGender, false);
        cbOther.setBounds(290, 220, 60, 30);

        lblHobbies = new Label("Hobbies:");
        lblHobbies.setBounds(50, 260, 80, 30);

        // Create the list of hobbies and add items
        listHobbies = new List(4, true);
        listHobbies.add("Reading");
        listHobbies.add("Gaming");
        listHobbies.add("Traveling");
        listHobbies.add("Music");
        listHobbies.add("Sports"); // Adding more items if needed
        listHobbies.add("Cooking");

        // Wrap the list in a ScrollPane to enable scrolling
        scrollPaneHobbies = new ScrollPane();
        scrollPaneHobbies.setBounds(150, 260, 180, 80);
        scrollPaneHobbies.add(listHobbies);

        btnLogin = new Button("Login");
        btnLogin.setBounds(100, 400, 80, 30);
        btnClear = new Button("Clear");
        btnClear.setBounds(220, 400, 80, 30);

        // Add components to frame
        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(cbRememberMe);
        add(lblOptions);
        add(choiceOptions);
        add(lblGender);
        add(cbMale);
        add(cbFemale);
        add(cbOther);
        add(lblHobbies);
        add(scrollPaneHobbies); // Add the ScrollPane instead of listHobbies
        add(btnLogin);
        add(btnClear);

        // Set frame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginInterfaceAWT();
    }
}
