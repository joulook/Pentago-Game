
package pantagu;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JFrame {
    
    int ap = 1;
    boolean Rotate = false;
    boolean play = false;
    int MainArray[][] = new int[6][6];
    {
        for(int i=0 ; i<6 ; i++){
            for(int j=0 ; j<6 ; j++){
                MainArray[i][j] = 0;
            }
        }
    }
    int Array_1 [][] = new int[3][3];
    int Array_2 [][] = new int[3][3];
    int Array_3 [][] = new int[3][3];
    int Array_4 [][] = new int[3][3];
    {
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                Array_1[i][j] = 0;
                Array_2[i][j] = 0;
                Array_3[i][j] = 0;
                Array_4[i][j] = 0;
            }
        }
    }
    public JButton getButton(int x , int y){
        JButton Button[][] = {{UL1,UL2,UL3,UR1,UR2,UR3},{UL4,UL5,UL6,UR4,UR5,UR6},{UL7,UL8,UL9,UR7,UR8,UR9},{DL1,DL2,DL3,DR1,DR2,DR3},{DL4,DL5,DL6,DR4,DR5,DR6},{DL7,DL8,DL9,DR7,DR8,DR9}};
        return Button[x][y];
    }

    public Game() {
        initComponents();
        this.setLocation(400, 100);
    }
    
    public void ChangeTurn(){
        if (ap == 1 && Rotate == true){
                ap = 2;
                Rotate = false;
                Turn.setText("Red");
                Turn.setForeground(Color.red);
                play = false;
            }else if(ap == 2 && Rotate == true){
                ap = 1;
                Rotate = false;
                Turn.setText("Blue");
                Turn.setForeground(Color.BLUE);
                play = false;
            }
    }
    public void play(int x , int y){
        if (ap == 1 && play == false && MainArray[x][y] == 0){
            MainArray[x][y] = 1;
            getButton(x, y).setBackground(Color.BLUE);
            play = true;
        }else if (ap == 2 && play == false && MainArray[x][y] == 0){
            MainArray[x][y] = 2;
            getButton(x, y).setBackground(Color.RED);
            play = true;
        }
        win();
    }
    public void FillAgain(){
        for (int i=0 ; i<6 ;i++){
            for(int j=0 ; j<6 ; j++){
                if (MainArray[i][j] == 1){
                    getButton(i, j).setBackground(Color.BLUE);
                }else if(MainArray[i][j] ==2){
                    getButton(i, j).setBackground(Color.RED);
                }else{
                    getButton(i, j).setBackground(Color.WHITE);
                }
            }
        }
        ChangeTurn();
    }
    public void win(){
//------------Horizontal------------
//For Blue
        for (int i=0 ; i<6 ; i++){
            for (int j=0 ; j<6 ; j++){
                if (j<=1){
                    int counter = 0;
                    for (int k=0 ; k<=4 ; k++){
                        if (MainArray[i][j+k] == 1){
                            counter++;
                        }
                    }
                    if (counter == 5){
                         JOptionPane.showMessageDialog(null, "Player Blue is winner", "Well Done!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
//For Red
        for (int i=0 ; i<6 ; i++){
            for (int j=0 ; j<6 ; j++){
                if (j<=1){
                    int counter = 0;
                    for (int k=0 ; k<=4 ; k++){
                        if (MainArray[i][j+k] == 2){
                            counter++;
                        }
                    }
                    if (counter == 5){
                         JOptionPane.showMessageDialog(null, "Player Red is winner", "Well Done!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
//------------Vertical------------
//For Blue
        for (int i=0 ; i<6 ; i++){
            for (int j=0 ; j<6 ; j++){
                if (i<=1){
                    int counter = 0;
                    for (int k=0 ; k<=4 ; k++){
                        if (MainArray[i+k][j] == 1){
                            counter++;
                        }
                    }
                    if (counter == 5){
                         JOptionPane.showMessageDialog(null, "Player Blue is winner", "Well Done!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
//For Red
        for (int i=0 ; i<6 ; i++){
            for (int j=0 ; j<6 ; j++){
                if (i<=1){
                    int counter = 0;
                    for (int k=0 ; k<=4 ; k++){
                        if (MainArray[i+k][j] == 1){
                            counter++;
                        }
                    }
                    if (counter == 5){
                         JOptionPane.showMessageDialog(null, "Player Blue is winner", "Well Done!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }  
//------------\------------  
//For Blue
        for (int i=0 ; i<6 ; i++){
            for (int j=0 ; j<6 ; j++){
                if ((i==j && i<=1) || (i+j == 1)){
                    int counter = 0;
                    for (int k=0 ; k<=4 ; k++){
                        if (MainArray[i+k][j+k] == 1){
                            counter++;
                        }
                    }
                    if (counter == 5){
                         JOptionPane.showMessageDialog(null, "Player Blue is winner", "Well Done!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
//For Red 
                for (int i=0 ; i<6 ; i++){
            for (int j=0 ; j<6 ; j++){
                if ((i==j && i<=1) || (i+j == 1)){
                    int counter = 0;
                    for (int k=0 ; k<=4 ; k++){
                        if (MainArray[i+k][j+k] == 2){
                            counter++;
                        }
                    }
                    if (counter == 5){
                         JOptionPane.showMessageDialog(null, "Player Red is winner", "Well Done!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
//------------/------------
//For Blue
                for (int i=0 ; i<6 ; i++){
            for (int j=0 ; j<6 ; j++){
                if ((i+j == 5 && i<=5 && i>=4) || (i-j == 4)){
                    int counter = 0;
                    for (int k=0 ; k<=4 ; k++){
                        if (MainArray[i-k][j+k] == 1){
                            counter++;
                        }
                    }
                    if (counter == 5){
                         JOptionPane.showMessageDialog(null, "Player Blue is winner", "Well Done!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            }
//For Red
                 for (int i=0 ; i<6 ; i++){
            for (int j=0 ; j<6 ; j++){
                if ((i+j == 5 && i<=5 && i>=4) || (i-j == 4)){
                    int counter = 0;
                    for (int k=0 ; k<=4 ; k++){
                        if (MainArray[i-k][j+k] == 2){
                            counter++;
                        }
                    }
                    if (counter == 5){
                         JOptionPane.showMessageDialog(null, "Player Red is winner", "Well Done!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        UL1 = new javax.swing.JButton();
        UL2 = new javax.swing.JButton();
        UL3 = new javax.swing.JButton();
        UL6 = new javax.swing.JButton();
        UL5 = new javax.swing.JButton();
        UL4 = new javax.swing.JButton();
        UL9 = new javax.swing.JButton();
        UL8 = new javax.swing.JButton();
        UL7 = new javax.swing.JButton();
        DL3 = new javax.swing.JButton();
        DL2 = new javax.swing.JButton();
        DL1 = new javax.swing.JButton();
        DL6 = new javax.swing.JButton();
        DL5 = new javax.swing.JButton();
        DL4 = new javax.swing.JButton();
        DL9 = new javax.swing.JButton();
        DL8 = new javax.swing.JButton();
        DL7 = new javax.swing.JButton();
        UR3 = new javax.swing.JButton();
        UR2 = new javax.swing.JButton();
        UR1 = new javax.swing.JButton();
        UR6 = new javax.swing.JButton();
        UR5 = new javax.swing.JButton();
        UR4 = new javax.swing.JButton();
        UR9 = new javax.swing.JButton();
        UR8 = new javax.swing.JButton();
        UR7 = new javax.swing.JButton();
        DR3 = new javax.swing.JButton();
        DR2 = new javax.swing.JButton();
        DR1 = new javax.swing.JButton();
        DR6 = new javax.swing.JButton();
        DR5 = new javax.swing.JButton();
        DR4 = new javax.swing.JButton();
        DR9 = new javax.swing.JButton();
        DR8 = new javax.swing.JButton();
        DR7 = new javax.swing.JButton();
        ULLeft = new javax.swing.JButton();
        DLLeft = new javax.swing.JButton();
        ULRight = new javax.swing.JButton();
        DLRight = new javax.swing.JButton();
        URLeft = new javax.swing.JButton();
        DRLeft = new javax.swing.JButton();
        URRight = new javax.swing.JButton();
        DRRight = new javax.swing.JButton();
        Turn = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pantagu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        UL1.setBackground(new java.awt.Color(255, 255, 255));
        UL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UL1ActionPerformed(evt);
            }
        });

        UL2.setBackground(new java.awt.Color(255, 255, 255));
        UL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UL2ActionPerformed(evt);
            }
        });

        UL3.setBackground(new java.awt.Color(255, 255, 255));
        UL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UL3ActionPerformed(evt);
            }
        });

        UL6.setBackground(new java.awt.Color(255, 255, 255));
        UL6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UL6ActionPerformed(evt);
            }
        });

        UL5.setBackground(new java.awt.Color(255, 255, 255));
        UL5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UL5ActionPerformed(evt);
            }
        });

        UL4.setBackground(new java.awt.Color(255, 255, 255));
        UL4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UL4ActionPerformed(evt);
            }
        });

        UL9.setBackground(new java.awt.Color(255, 255, 255));
        UL9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UL9ActionPerformed(evt);
            }
        });

        UL8.setBackground(new java.awt.Color(255, 255, 255));
        UL8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UL8ActionPerformed(evt);
            }
        });

        UL7.setBackground(new java.awt.Color(255, 255, 255));
        UL7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UL7ActionPerformed(evt);
            }
        });

        DL3.setBackground(new java.awt.Color(255, 255, 255));
        DL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DL3ActionPerformed(evt);
            }
        });

        DL2.setBackground(new java.awt.Color(255, 255, 255));
        DL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DL2ActionPerformed(evt);
            }
        });

        DL1.setBackground(new java.awt.Color(255, 255, 255));
        DL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DL1ActionPerformed(evt);
            }
        });

        DL6.setBackground(new java.awt.Color(255, 255, 255));
        DL6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DL6ActionPerformed(evt);
            }
        });

        DL5.setBackground(new java.awt.Color(255, 255, 255));
        DL5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DL5ActionPerformed(evt);
            }
        });

        DL4.setBackground(new java.awt.Color(255, 255, 255));
        DL4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DL4ActionPerformed(evt);
            }
        });

        DL9.setBackground(new java.awt.Color(255, 255, 255));
        DL9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DL9ActionPerformed(evt);
            }
        });

        DL8.setBackground(new java.awt.Color(255, 255, 255));
        DL8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DL8ActionPerformed(evt);
            }
        });

        DL7.setBackground(new java.awt.Color(255, 255, 255));
        DL7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DL7ActionPerformed(evt);
            }
        });

        UR3.setBackground(new java.awt.Color(255, 255, 255));
        UR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UR3ActionPerformed(evt);
            }
        });

        UR2.setBackground(new java.awt.Color(255, 255, 255));
        UR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UR2ActionPerformed(evt);
            }
        });

        UR1.setBackground(new java.awt.Color(255, 255, 255));
        UR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UR1ActionPerformed(evt);
            }
        });

        UR6.setBackground(new java.awt.Color(255, 255, 255));
        UR6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UR6ActionPerformed(evt);
            }
        });

        UR5.setBackground(new java.awt.Color(255, 255, 255));
        UR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UR5ActionPerformed(evt);
            }
        });

        UR4.setBackground(new java.awt.Color(255, 255, 255));
        UR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UR4ActionPerformed(evt);
            }
        });

        UR9.setBackground(new java.awt.Color(255, 255, 255));
        UR9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UR9ActionPerformed(evt);
            }
        });

        UR8.setBackground(new java.awt.Color(255, 255, 255));
        UR8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UR8ActionPerformed(evt);
            }
        });

        UR7.setBackground(new java.awt.Color(255, 255, 255));
        UR7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UR7ActionPerformed(evt);
            }
        });

        DR3.setBackground(new java.awt.Color(255, 255, 255));
        DR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DR3ActionPerformed(evt);
            }
        });

        DR2.setBackground(new java.awt.Color(255, 255, 255));
        DR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DR2ActionPerformed(evt);
            }
        });

        DR1.setBackground(new java.awt.Color(255, 255, 255));
        DR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DR1ActionPerformed(evt);
            }
        });

        DR6.setBackground(new java.awt.Color(255, 255, 255));
        DR6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DR6ActionPerformed(evt);
            }
        });

        DR5.setBackground(new java.awt.Color(255, 255, 255));
        DR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DR5ActionPerformed(evt);
            }
        });

        DR4.setBackground(new java.awt.Color(255, 255, 255));
        DR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DR4ActionPerformed(evt);
            }
        });

        DR9.setBackground(new java.awt.Color(255, 255, 255));
        DR9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DR9ActionPerformed(evt);
            }
        });

        DR8.setBackground(new java.awt.Color(255, 255, 255));
        DR8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DR8ActionPerformed(evt);
            }
        });

        DR7.setBackground(new java.awt.Color(255, 255, 255));
        DR7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DR7ActionPerformed(evt);
            }
        });

        ULLeft.setBackground(new java.awt.Color(153, 153, 153));
        ULLeft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ULLeft.setForeground(java.awt.Color.white);
        ULLeft.setText("<");
        ULLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ULLeftActionPerformed(evt);
            }
        });

        DLLeft.setBackground(new java.awt.Color(153, 153, 153));
        DLLeft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DLLeft.setForeground(java.awt.Color.white);
        DLLeft.setText("<");
        DLLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DLLeftActionPerformed(evt);
            }
        });

        ULRight.setBackground(new java.awt.Color(153, 153, 153));
        ULRight.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ULRight.setForeground(java.awt.Color.white);
        ULRight.setText(">");
        ULRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ULRightActionPerformed(evt);
            }
        });

        DLRight.setBackground(new java.awt.Color(153, 153, 153));
        DLRight.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DLRight.setForeground(java.awt.Color.white);
        DLRight.setText(">");
        DLRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DLRightActionPerformed(evt);
            }
        });

        URLeft.setBackground(new java.awt.Color(153, 153, 153));
        URLeft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        URLeft.setForeground(java.awt.Color.white);
        URLeft.setText("<");
        URLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URLeftActionPerformed(evt);
            }
        });

        DRLeft.setBackground(new java.awt.Color(153, 153, 153));
        DRLeft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DRLeft.setForeground(java.awt.Color.white);
        DRLeft.setText("<");
        DRLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRLeftActionPerformed(evt);
            }
        });

        URRight.setBackground(new java.awt.Color(153, 153, 153));
        URRight.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        URRight.setForeground(java.awt.Color.white);
        URRight.setText(">");
        URRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URRightActionPerformed(evt);
            }
        });

        DRRight.setBackground(new java.awt.Color(153, 153, 153));
        DRRight.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DRRight.setForeground(java.awt.Color.white);
        DRRight.setText(">");
        DRRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRRightActionPerformed(evt);
            }
        });

        Turn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Turn.setForeground(java.awt.Color.blue);
        Turn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turn.setText("Blue");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ULLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DLLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UL4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UL5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UL6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UL7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UL8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UL9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UL1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UL2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UL3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DL7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DL8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DL9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DL4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DL5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DL6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DL1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DL2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DL3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DLRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ULRight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(URLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(UR7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(UR8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(UR9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(UR4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(UR5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(UR6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(DR1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DR2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DR3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(DR4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DR5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DR6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(UR1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UR2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UR3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(DR7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DR8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DR9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(URRight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRRight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(Turn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Turn, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UR3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UR1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UR5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UR6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UR4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UR8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UR9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UR7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(URLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(URRight, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DR3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DR1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DR5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DR6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DR4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DR8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DR9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DR7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DRLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DRRight, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(UL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(UL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(UL1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(UL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(UL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(UL4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(UL8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(UL9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(UL7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(ULLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ULRight, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DL1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DL4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DL8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DL9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DL7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DLLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DLRight, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UL1ActionPerformed
        play(0, 0);
    }//GEN-LAST:event_UL1ActionPerformed

    private void UL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UL2ActionPerformed
        play(0, 1);
    }//GEN-LAST:event_UL2ActionPerformed

    private void UL3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UL3ActionPerformed
        play(0, 2);
    }//GEN-LAST:event_UL3ActionPerformed

    private void UR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UR1ActionPerformed
        play(0, 3);
    }//GEN-LAST:event_UR1ActionPerformed

    private void UR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UR2ActionPerformed
        play(0, 4);
    }//GEN-LAST:event_UR2ActionPerformed

    private void UR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UR3ActionPerformed
        play(0, 5);
    }//GEN-LAST:event_UR3ActionPerformed

    private void UL4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UL4ActionPerformed
        play(1, 0);
    }//GEN-LAST:event_UL4ActionPerformed

    private void UL5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UL5ActionPerformed
        play(1, 1);
    }//GEN-LAST:event_UL5ActionPerformed

    private void UL6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UL6ActionPerformed
        play(1, 2);
    }//GEN-LAST:event_UL6ActionPerformed

    private void UR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UR4ActionPerformed
       play(1, 3);
    }//GEN-LAST:event_UR4ActionPerformed

    private void UR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UR5ActionPerformed
        play(1, 4);
    }//GEN-LAST:event_UR5ActionPerformed

    private void UR6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UR6ActionPerformed
        play(1, 5);
    }//GEN-LAST:event_UR6ActionPerformed

    private void UL7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UL7ActionPerformed
        play(2, 0);
    }//GEN-LAST:event_UL7ActionPerformed

    private void UL8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UL8ActionPerformed
        play(2, 1);
    }//GEN-LAST:event_UL8ActionPerformed

    private void UL9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UL9ActionPerformed
        play(2, 2);
    }//GEN-LAST:event_UL9ActionPerformed

    private void UR7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UR7ActionPerformed
        play(2, 3);
    }//GEN-LAST:event_UR7ActionPerformed

    private void UR8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UR8ActionPerformed
        play(2, 4);
    }//GEN-LAST:event_UR8ActionPerformed

    private void UR9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UR9ActionPerformed
        play(2, 5);
    }//GEN-LAST:event_UR9ActionPerformed

    private void DL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DL1ActionPerformed
        play(3, 0);
    }//GEN-LAST:event_DL1ActionPerformed

    private void DL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DL2ActionPerformed
        play(3, 1);
    }//GEN-LAST:event_DL2ActionPerformed

    private void DL3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DL3ActionPerformed
        play(3, 2);
    }//GEN-LAST:event_DL3ActionPerformed

    private void DR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DR1ActionPerformed
        play(3, 3);
    }//GEN-LAST:event_DR1ActionPerformed

    private void DR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DR2ActionPerformed
        play(3, 4);
    }//GEN-LAST:event_DR2ActionPerformed

    private void DR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DR3ActionPerformed
        play(3, 5);
    }//GEN-LAST:event_DR3ActionPerformed

    private void DL4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DL4ActionPerformed
        play(4, 0);
    }//GEN-LAST:event_DL4ActionPerformed

    private void DL5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DL5ActionPerformed
        play(4, 1);
    }//GEN-LAST:event_DL5ActionPerformed

    private void DL6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DL6ActionPerformed
        play(4, 2);
    }//GEN-LAST:event_DL6ActionPerformed

    private void DR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DR4ActionPerformed
        play(4, 3);
    }//GEN-LAST:event_DR4ActionPerformed

    private void DR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DR5ActionPerformed
        play(4, 4);
    }//GEN-LAST:event_DR5ActionPerformed

    private void DR6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DR6ActionPerformed
        play(4, 5);
    }//GEN-LAST:event_DR6ActionPerformed

    private void DL7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DL7ActionPerformed
        play(5, 0);
    }//GEN-LAST:event_DL7ActionPerformed

    private void DL8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DL8ActionPerformed
        play(5, 1);
    }//GEN-LAST:event_DL8ActionPerformed

    private void DL9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DL9ActionPerformed
        play(5, 2);
    }//GEN-LAST:event_DL9ActionPerformed

    private void DR7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DR7ActionPerformed
        play(5, 3);
    }//GEN-LAST:event_DR7ActionPerformed

    private void DR8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DR8ActionPerformed
        play(5, 4);
    }//GEN-LAST:event_DR8ActionPerformed

    private void DR9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DR9ActionPerformed
        play(5, 5);
    }//GEN-LAST:event_DR9ActionPerformed

    private void ULRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ULRightActionPerformed
    if(play == true){
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array_1[i][j] = MainArray[i][j];
        }
    }
    int Array[][] = new int[3][3];
    for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array[i][j] = MainArray[i][j];
        }
    }
    for (int i=0 ; i<3 ; i++){
        for (int j=0 ; j<3 ; j++){
            Array_1[i][j] = Array[3-j-1][i];
        }
    }
    for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                MainArray[i][j] = Array_1[i][j];
            }
        }
    Rotate = true;
    FillAgain();
    win();
    }
    }//GEN-LAST:event_ULRightActionPerformed

    private void URRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URRightActionPerformed
    if (play == true){    
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array_2[i][j] = MainArray[i][j+3];
        }
        }
        int Array[][] = new int [3][3];
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array[i][j] = MainArray[i][j+3];
        }
        }
        for (int i=0 ; i<3 ; i++){
        for (int j=0 ; j<3 ; j++){
            Array_2[i][j] = Array[3-j-1][i];
        }
    }
        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                MainArray[i][j+3] = Array_2[i][j];
            }
        }
        Rotate = true;
        FillAgain();
        win();
    }
    }//GEN-LAST:event_URRightActionPerformed

    private void ULLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ULLeftActionPerformed
       if (play == true){
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array_1[i][j] = MainArray[i][j];
        }
        }
        int Array[][] = new int[3][3];
    for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array[i][j] = MainArray[i][j];
        }
    }
            for (int i=0 ; i<3 ; i++){
        for (int j=0 ; j<3 ; j++){
            Array_1[i][j] = Array[j][3-i-1];
        }
    }
        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                MainArray[i][j] = Array_1[i][j];
            }
        }
        Rotate = true;
        FillAgain();
        win();
       }
    }//GEN-LAST:event_ULLeftActionPerformed

    private void URLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URLeftActionPerformed
    if (play == true){   
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array_2[i][j] = MainArray[i][j+3];
        }
        }
        int Array[][] = new int[3][3];
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array[i][j] = MainArray[i][j+3];
        }
        }
            for (int i=0 ; i<3 ; i++){
        for (int j=0 ; j<3 ; j++){
            Array_2[i][j] = Array[j][3-i-1];
        }
        }
        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                MainArray[i][j+3] = Array_2[i][j];
            }
        }
        Rotate = true;
        FillAgain();
        win();
    }
    }//GEN-LAST:event_URLeftActionPerformed

    private void DLLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DLLeftActionPerformed
    if (play == true){    
           for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array_3[i][j] = MainArray[i+3][j];
        }
        }
        int Array[][] = new int[3][3];
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array[i][j] = MainArray[i+3][j];
        }
        }
        for (int i=0 ; i<3 ; i++){
        for (int j=0 ; j<3 ; j++){
            Array_3[i][j] = Array[j][3-i-1];
        }
    }
        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                MainArray[i+3][j] = Array_3[i][j];
            }
        }
        Rotate = true;
        FillAgain();
        win();
    }
    }//GEN-LAST:event_DLLeftActionPerformed

    private void DLRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DLRightActionPerformed
    if (play == true){    
           for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array_3[i][j] = MainArray[i+3][j];
        }
        }
        int Array[][] = new int[3][3];
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array[i][j] = MainArray[i+3][j];
        }
        }
        for (int i=0 ; i<3 ; i++){
        for (int j=0 ; j<3 ; j++){
            Array_3[i][j] = Array[3-j-1][i];
        }
    }
        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                MainArray[i+3][j] = Array_3[i][j];
            }
        }
        Rotate = true;
        FillAgain();
        win();
    }
    }//GEN-LAST:event_DLRightActionPerformed

    private void DRLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRLeftActionPerformed
    if (play == true){    
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array_4[i][j] = MainArray[i+3][j+3];
        }
        }
        int Array[][] = new int[3][3];
        if (play == true){    
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array[i][j] = MainArray[i+3][j+3];
        }
        }
        for(int k=0 ; k<3 ; k++){
            for (int i=0 ; i<3 ; i++){
        for (int j=0 ; j<3 ; j++){
            Array_4[i][j] = Array[j][3-i-1];
        }
    }
        }
        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                MainArray[i+3][j+3] = Array_4[i][j];
            }
        }
        Rotate = true;
        FillAgain();
        win();
    }
    }
    }//GEN-LAST:event_DRLeftActionPerformed

    private void DRRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRRightActionPerformed
    if (play == true){    
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array_4[i][j] = MainArray[i+3][j+3];
        }
        }
        int Array[][] = new int[3][3];
        if (play == true){    
        for (int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){
            Array[i][j] = MainArray[i+3][j+3];
        }
        }
        for(int k=0 ; k<3 ; k++){
            for (int i=0 ; i<3 ; i++){
        for (int j=0 ; j<3 ; j++){
            Array_4[i][j] = Array[3-j-1][i];
        }
    }
        }
        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                MainArray[i+3][j+3] = Array_4[i][j];
            }
        }
        Rotate = true;
        FillAgain();
        win();
    }
    }
    }//GEN-LAST:event_DRRightActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DL1;
    private javax.swing.JButton DL2;
    private javax.swing.JButton DL3;
    private javax.swing.JButton DL4;
    private javax.swing.JButton DL5;
    private javax.swing.JButton DL6;
    private javax.swing.JButton DL7;
    private javax.swing.JButton DL8;
    private javax.swing.JButton DL9;
    private javax.swing.JButton DLLeft;
    private javax.swing.JButton DLRight;
    private javax.swing.JButton DR1;
    private javax.swing.JButton DR2;
    private javax.swing.JButton DR3;
    private javax.swing.JButton DR4;
    private javax.swing.JButton DR5;
    private javax.swing.JButton DR6;
    private javax.swing.JButton DR7;
    private javax.swing.JButton DR8;
    private javax.swing.JButton DR9;
    private javax.swing.JButton DRLeft;
    private javax.swing.JButton DRRight;
    private javax.swing.JLabel Turn;
    private javax.swing.JButton UL1;
    private javax.swing.JButton UL2;
    private javax.swing.JButton UL3;
    private javax.swing.JButton UL4;
    private javax.swing.JButton UL5;
    private javax.swing.JButton UL6;
    private javax.swing.JButton UL7;
    private javax.swing.JButton UL8;
    private javax.swing.JButton UL9;
    private javax.swing.JButton ULLeft;
    private javax.swing.JButton ULRight;
    private javax.swing.JButton UR1;
    private javax.swing.JButton UR2;
    private javax.swing.JButton UR3;
    private javax.swing.JButton UR4;
    private javax.swing.JButton UR5;
    private javax.swing.JButton UR6;
    private javax.swing.JButton UR7;
    private javax.swing.JButton UR8;
    private javax.swing.JButton UR9;
    private javax.swing.JButton URLeft;
    private javax.swing.JButton URRight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
