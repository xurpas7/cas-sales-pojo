/**
 * @author  Michael Cuison
 */
package org.rmj.sales.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Sales_Order_Detail")

public class UnitSalesOrderDetail implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "nQuantity")
    private int nQuantity;
    
    @Column(name = "nUnitPrce")
    private Number nUnitPrce;
    
    @Column(name = "nDiscount")
    private Number nDiscount;
    
    @Column(name = "nAddDiscx")
    private Number nAddDiscx;
    
    @Column(name = "cClassify")
    private String cClassify;
    
    @Column(name = "nApproved")
    private int nApproved;
    
    @Column(name = "nIssuedxx")
    private int nIssuedxx;
    
    @Column(name = "nCancelld")
    private int nCancelld;
    
    @Column(name = "sNotesxxx")
    private String sNotesxxx;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitSalesOrderDetail(){
        this.sTransNox = "";
        this.nEntryNox = 0;
        this.sStockIDx = "";
        this.nQuantity = 0;
        this.nUnitPrce = 0.00;
        this.nDiscount = 0.00;
        this.nAddDiscx = 0.00;
        this.cClassify = "";
        this.nApproved = 0;
        this.nIssuedxx = 0;
        this.nCancelld = 0;
        this.sNotesxxx = "";
        this.dModified = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("nEntryNox");
        laColumns.add("sStockIDx");
        laColumns.add("nQuantity");
        laColumns.add("nUnitPrce");
        laColumns.add("nDiscount");
        laColumns.add("nAddDiscx");
        laColumns.add("cClassify");
        laColumns.add("nApproved");
        laColumns.add("nIssuedxx");
        laColumns.add("nCancelld");
        laColumns.add("sNotesxxx");
        laColumns.add("dModified");
    }
    
    public void setTransNo(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNo(){
        return sTransNox;
    }
    
    public void setEntryNo(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNo(){
        return nEntryNox;
    }
    
    public void setStockID(String sStockIDx){
        this.sStockIDx = sStockIDx;
    }
    public String getStockID(){
        return sStockIDx;
    }
    
    public void setQuantity(int nQuantity){
        this.nQuantity = nQuantity;
    }
    public int getQuantity(){
        return nQuantity;
    }
    
    public void setUnitPrice(Number nUnitPrce){
        this.nUnitPrce = nUnitPrce;
    }
    public Number getUnitPrice(){
        return nUnitPrce;
    }
    
    public void setDiscount(Number nDiscount){
        this.nDiscount = nDiscount;
    }
    public Number getDiscount(){
        return nDiscount;
    }
    
    public void setAddtlDiscount(Number nAddDiscx){
        this.nAddDiscx = nAddDiscx;
    }
    public Number getAddtlDiscount(){
        return nAddDiscx;
    }
    
    public void setClassification(String cClassify){
        this.cClassify = cClassify;
    }
    public String getClassification(){
        return cClassify;
    }
    
    public void setQtyApproved(int nApproved){
        this.nApproved = nApproved;
    }
    public int getQtyApproved(){
        return nApproved;
    }
    
    public void setQtyIssued(int nIssuedxx){
        this.nIssuedxx = nIssuedxx;
    }
    public int getQtyIssued(){
        return nIssuedxx;
    }
    
    public void setQtyCancelled(int nCancelld){
        this.nCancelld = nCancelld;
    }
    public int getQtyCancelled(){
        return nCancelld;
    }
    
    public void setNotes(String sNotesxxx){
        this.sNotesxxx = sNotesxxx;
    }
    public String getNotes(){
        return sNotesxxx;
    }
    
    public void setDateModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getDateModified(){
        return dModified;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sTransNox != null ? sTransNox.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitSalesOrderDetail)) {
            return false;
        }
        UnitSalesOrderDetail other = (UnitSalesOrderDetail) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.integsys.pojo.UnitSalesOrderDetail[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return nEntryNox;
            case 3: return sStockIDx;
            case 4: return nQuantity;
            case 5: return nUnitPrce;
            case 6: return nDiscount;
            case 7: return nAddDiscx;
            case 8: return cClassify;
            case 9: return nApproved;
            case 10: return nIssuedxx;
            case 11: return nCancelld;
            case 12: return sNotesxxx;
            case 13: return dModified;
            default: return null;
        }
    }

    @Override
    public Object getValue(String fsColumn) {
        int lnCol = getColumn(fsColumn);
        
        if (lnCol > 0){
            return getValue(lnCol);
        } else
            return null;
    }

    @Override
    public String getTable() {
        return "Sales_Order_Detail";
    }

    @Override
    public String getColumn(int fnCol) {
        if (laColumns.size() < fnCol){
            return "";
        } else 
            return (String) laColumns.get(fnCol - 1);
    }

    @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    @Override
    public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1: sTransNox = (String) foValue; break;
            case 2: nEntryNox = (int) foValue; break;
            case 3: sStockIDx = (String) foValue; break;
            case 4: nQuantity = (int) foValue; break;
            case 5: nUnitPrce = (Number) foValue; break;
            case 6: nDiscount = (Number) foValue; break;
            case 7: nAddDiscx = (Number) foValue; break;
            case 8: cClassify = (String) foValue; break;
            case 9: nApproved = (int) foValue; break;
            case 10: nIssuedxx = (int) foValue; break;
            case 11: nCancelld = (int) foValue; break;
            case 12: sNotesxxx = (String) foValue; break;
            case 13: dModified = (Date) foValue; break;
        }    
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        int lnCol = getColumn(fsColumn);
        if (lnCol > 0){
            setValue(lnCol, foValue);
        }
    }

    @Override
    public int getColumnCount() {
        return laColumns.size();
    }

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
