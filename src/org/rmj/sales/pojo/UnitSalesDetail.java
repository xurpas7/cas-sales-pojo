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
@Table(name="Sales_Detail")

public class UnitSalesDetail implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "sOrderNox")
    private String sOrderNox;
    
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "nQuantity")
    private int nQuantity;
    
    @Column(name = "nInvCostx")
    private Number nInvCostx;
    
    @Column(name = "nUnitPrce")
    private Number nUnitPrce;
    
    @Column(name = "nDiscount")
    private Number nDiscount;
    
    @Column(name = "nAddDiscx")
    private Number nAddDiscx;
    
    @Column(name = "sSerialID")
    private String sSerialID;
    
    @Column(name = "cNewStock")
    private String cNewStock;
    
    @Column(name = "sInsTypID")
    private String sInsTypID;
    
    @Column(name = "nInsAmtxx")
    private Number nInsAmtxx;
    
    @Column(name = "sWarrntNo")
    private String sWarrntNo;
    
    @Column(name = "cUnitForm")
    private String cUnitForm;
    
    @Column(name = "sNotesxxx")
    private String sNotesxxx;
    
    @Column(name = "cDetailxx")
    private String cDetailxx;
    
    @Column(name = "cPromoItm")
    private String cPromoItm;
    
    @Column(name = "cComboItm")
    private String cComboItm;

    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitSalesDetail(){
        this.sTransNox = "";
        this.nEntryNox = 0;
        this.sOrderNox = "";
        this.sStockIDx = "";
        this.nQuantity = 0;
        this.nInvCostx = 0.00;
        this.nUnitPrce = 0.00;
        this.nDiscount = 0.00;
        this.nAddDiscx = 0.00;
        this.sSerialID = "";
        this.cNewStock = "1";
        this.sInsTypID = "";
        this.nInsAmtxx = 0.00;
        this.sWarrntNo = "";
        this.cUnitForm = "1";
        this.sNotesxxx = "";
        this.cDetailxx = "0";
        this.cPromoItm = "0";
        this.cComboItm = "0";
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("nEntryNox");
        laColumns.add("sOrderNox");
        laColumns.add("sStockIDx");
        laColumns.add("nQuantity");
        laColumns.add("nInvCostx");
        laColumns.add("nUnitPrce");
        laColumns.add("nDiscount");
        laColumns.add("nAddDiscx");
        laColumns.add("sSerialID");
        laColumns.add("cNewStock");
        laColumns.add("sInsTypID");
        laColumns.add("nInsAmtxx");
        laColumns.add("sWarrntNo");
        laColumns.add("cUnitForm");
        laColumns.add("sNotesxxx");
        laColumns.add("cDetailxx");
        laColumns.add("cPromoItm");
        laColumns.add("cComboItm");
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
    
    public void setOrderNo(String sOrderNox){
        this.sOrderNox = sOrderNox;
    }
    public String getOrderNo(){
        return sOrderNox;
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
    
    public void setInvCost(Number nInvCostx){
        this.nInvCostx = nInvCostx;
    }
    public Number getInvCost(){
        return nInvCostx;
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
    
    public void setSerialID(String sSerialID){
        this.sSerialID = sSerialID;
    }
    public String getSerialID(){
        return sSerialID;
    }
       
    public void setIsNewStock(String sInsTypID){
        this.sInsTypID = sInsTypID;
    }
    public String getIsNewStock(){
        return sInsTypID;
    }
    
    public void setInsTypID(String sInsTypID){
        this.sInsTypID = sInsTypID;
    }
    public String getInsTypID(){
        return sInsTypID;
    }
    
    public void setInsuranceAmount(Number nInsAmtxx){
        this.nInsAmtxx = nInsAmtxx;
    }
    public Number getInsuranceAmount(){
        return nInsAmtxx;
    }
    
    public void setWarrantyNo(String sWarrntNo){
        this.sWarrntNo = sWarrntNo;
    }
    public String getWarrantyNo(){
        return sWarrntNo;
    }
    
    public void setUnitForm(String cUnitForm){
        this.cUnitForm = cUnitForm;
    }
    public String getUnitForm(){
        return cUnitForm;
    }
    
    public void setNotes(String sNotesxxx){
        this.sNotesxxx = sNotesxxx;
    }
    public String getNotes(){
        return sNotesxxx;
    }
    
    public void setIsDetail(String cDetailxx){
        this.cDetailxx = cDetailxx;
    }
    public String getIsDetail(){
        return cDetailxx;
    }
    
    public void setIsPromoItem(String cPromoItm){
        this.cPromoItm = cPromoItm;
    }
    public String getIsPromoItem(){
        return cPromoItm;
    }
    
    public void setIsComboItem(String cComboItm){
        this.cComboItm = cComboItm;
    }
    public String getIsComboItem(){
        return cComboItm;
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
        if (!(object instanceof UnitSalesDetail)) {
            return false;
        }
        UnitSalesDetail other = (UnitSalesDetail) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.integsys.pojo.UnitSalesDetail[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return nEntryNox;
            case 3: return sOrderNox;
            case 4: return sStockIDx;
            case 5: return nQuantity;
            case 6: return nInvCostx;
            case 7: return nUnitPrce;
            case 8: return nDiscount;
            case 9: return nAddDiscx;
            case 10: return sSerialID;
            case 11: return cNewStock;
            case 12: return sInsTypID;
            case 13: return nInsAmtxx;
            case 14: return sWarrntNo;
            case 15: return cUnitForm;
            case 16: return sNotesxxx;
            case 17: return cDetailxx;
            case 18: return cPromoItm;
            case 19: return cComboItm;
            case 20: return dModified;
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
        return "Sales_Detail";
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
            case 3: sOrderNox = (String) foValue; break;
            case 4: sStockIDx = (String) foValue; break;
            case 5: nQuantity = (int) foValue; break;
            case 6: nInvCostx = (Number) foValue; break;
            case 7: nUnitPrce = (Number) foValue; break;
            case 8: nDiscount = (Number) foValue; break;
            case 9: nAddDiscx = (Number) foValue; break;
            case 10: sSerialID = (String) foValue; break;
            case 11: cNewStock = (String) foValue; break;
            case 12: sInsTypID = (String) foValue; break;
            case 13: nInsAmtxx = (Number) foValue; break;
            case 14: sWarrntNo = (String) foValue; break;
            case 15: cUnitForm = (String) foValue; break;
            case 16: sNotesxxx = (String) foValue; break;
            case 17: cDetailxx = (String) foValue; break;
            case 18: cPromoItm = (String) foValue; break;
            case 19: cComboItm = (String) foValue; break;
            case 20: dModified = (Date) foValue; break;
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
