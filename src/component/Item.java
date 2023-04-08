package component;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import model.ModelItem;

public class Item extends javax.swing.JPanel {

    private boolean selected;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    public Item() {
        initComponents();
        setOpaque(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private ModelItem data;
    public void setData(ModelItem data){
         this.data = data;
         pic.setImage(data.getImage());
         lbMovieName.setText(data.getItemName());
         lbDescription.setText(data.getDescription());
    }

    public ModelItem getData() {
        return data;
    }
    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(242, 242, 242));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        if(selected){
            g2.setColor(new Color(94, 156, 255));
            g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 0, 0);
            
        }
        g2.dispose();
        super.paint(grphcs);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMovieName = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        pic = new swing.PictureBox();
        starRating1 = new star.rating.StarRating();
        jbnClick = new swing.Button();

        lbMovieName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMovieName.setForeground(new java.awt.Color(76, 76, 76));
        lbMovieName.setText("Name");

        lbDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDescription.setForeground(new java.awt.Color(178, 178, 178));
        lbDescription.setText("Description");

        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/1234.jpg"))); // NOI18N

        starRating1.setForeground(new java.awt.Color(6, 167, 59));
        starRating1.setStar(5);

        jbnClick.setBackground(new java.awt.Color(255, 153, 153));
        jbnClick.setText("Xem  Phim");
        jbnClick.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jbnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnClickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMovieName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbnClick, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(starRating1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMovieName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbnClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(starRating1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnClickActionPerformed
        // TODO add your handling code here:
        jbnClick.addActionListener((ActionEvent e) -> {
            try {
                Desktop.getDesktop().browse(new URI(data.getLinkFilm()));
            } catch (IOException | URISyntaxException ex) {
            }
        });
    }//GEN-LAST:event_jbnClickActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button jbnClick;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbMovieName;
    private swing.PictureBox pic;
    private star.rating.StarRating starRating1;
    // End of variables declaration//GEN-END:variables
}
