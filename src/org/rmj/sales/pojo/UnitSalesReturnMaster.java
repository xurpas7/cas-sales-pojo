/**
 * @author  Michael Cuison
 * 
 * @since 2018.09.19
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
import org.rmj.appdriver.constants.TransactionStatus;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Sales_Return_Master")

public class UnitSalesReturnMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Column(name = "dTransact")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dTransact;
    
    @Column(name = "sClientID")
    private String sClientID;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;
    
    @Column(name = "nTranTotl")
    private Number nTranTotl;
    
    @Column(name = "nVATRatex")
    private Number nVATRatex;
    
    @Column(name = "nDiscount")
    private Number nDiscount;
    
    @Column(name = "nAddDiscx")
    private Number nAddDiscx;
    
    @Column(name = "nFreightx")
    private Number nFreightx;
    
    @Column(name = "nAmtPaidx")
    private Number nAmtPaidx;
    
    @Column(name = "sSourceCd")
    private String sSourceCd;
    
    @Column(name = "sSourceNo")
    private String sSourceNo;
    
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "sInvTypCd")
    private String sInvTypCd;
    
    @Column(name = "cTranStat")
    private String cTranStat;
    
    @Column(name = "sPrepared")
    private String sPrepared;
    
    @Basic(optional = true)
    @Column(name = "dPrepared")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dPrepared;
    
    @Column(name = "sApproved")
    private String sApproved;
    
    @Basic(optional = false)
    @Column(name = "dApproved")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dApproved;
    
    @Column(name = "sAprvCode")
    private String sAprvCode;
    
    @Column(name = "sPostedxx")
    private String sPostedxx;
    
    @Basic(optional = true)
    @Column(name = "dPostedxx")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dPostedxx;
    
    @Column(name = "sModified")
    private String sModified;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitSalesReturnMaster(){
        this.sTransNox = "";
        this.sBranchCd = "";
        this.dTransact = null;
        this.sClientID = "";
        this.sRemarksx = "";
        this.nTranTotl = 0.00;
        this.nVATRatex = 1.12;
        this.nDiscount = 0.00;
        this.nAddDiscx = 0.00;
        this.nFreightx = 0.00;
        this.nAmtPaidx = 0.00;
        this.sSourceCd = "";
        this.sSourceNo = "";
        this.nEntryNox = 0;
        this.sInvTypCd = "";
        this.cTranStat = TransactionStatus.STATE_OPEN;
        this.sPrepared = "";
        this.dPrepared = null;
        this.sApproved = "";
        this.dApproved = null;
        this.sAprvCode = "";
        this.sPostedxx = "";
        this.dPostedxx = null;
        this.sModified = "";
        this.dModified = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sBranchCd");
        laColumns.add("dTransact");
        laColumns.add("sClientID");
        laColumns.add("sRemarksx");
        laColumns.add("nTranTotl");
        laColumns.add("nVATRatex");
        laColumns.add("nDiscount");
        laColumns.add("nAddDiscx");
        laColumns.add("nFreightx");
        laColumns.add("nAmtPaidx");
        laColumns.add("sSourceNo");
        laColumns.add("sSourceCd");
        laColumns.add("nEntryNox");
        laColumns.add("sInvTypCd");
        laColumns.add("cTranStat");
        laColumns.add("sPrepared");
        laColumns.add("dPrepared");
        laColumns.add("sApproved");
        laColumns.add("dApproved");
        laColumns.add("sAprvCode");
        laColumns.add("sPostedxx");
        laColumns.add("dPostedxx");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setTransNox(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNox(){
        return sTransNox;
    }
    
    public void setBranchCd(String sBranchCd){
        this.sBranchCd = sBranchCd;
    }
    public String getBranchCd(){
        return sBranchCd;
    }
    
    public void setTransact(Date dTransact){
        this.dTransact = dTransact;
    }
    public Date getTransact(){
        return dTransact;
    }
    
    public void setClientID(String sClientID){
        this.sClientID = sClientID;
    }
    public String getClientID(){
        return sClientID;
    }
        
    public void setRemarksx(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String getRemarksx(){
        return sRemarksx;
    }
    
    public void setTranTotl(Number nTranTotl){
        this.nTranTotl = nTranTotl;
    }
    public Number getTranTotl(){
        return nTranTotl;
    }
    
    public void setVATRatex(Number nVATRatex){
        this.nVATRatex = nVATRatex;
    }
    public Number getVATRatex(){
        return nVATRatex;
    }
    
    public void setDiscount(Number nDiscount){
        this.nDiscount = nDiscount;
    }
    public Number getDiscount(){
        return nDiscount;
    }
    
    public void setAddDiscx(Number nAddDiscx){
        this.nAddDiscx = nAddDiscx;
    }
    public Number getAddDiscx(){
        return nAddDiscx;
    }
    
    public void setFreightx(Number nFreightx){
        this.nFreightx = nFreightx;
    }
    public Number getFreightx(){
        return nFreightx;
    }
    
    public void setAmtPaidx(Number nAmtPaidx){
        this.nAmtPaidx = nAmtPaidx;
    }
    public Number getAmtPaidx(){
        return nAmtPaidx;
    }
    
    public void setSourceCd(String sSourceCd){
        this.sSourceCd = sSourceCd;
    }
    public String getSourceCd(){
        return sSourceCd;
    }
    
    public void setSourceNo(String sSourceNo){
        this.sSourceNo = sSourceNo;
    }
    public String getSourceNo(){
        return sSourceNo;
    }
    
    public void setEntryNox(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNox(){
        return nEntryNox;
    }
    
    public void setInvTypCd(String sInvTypCd){
        this.sInvTypCd = sInvTypCd;
    }
    public String getInvTypCd(){
        return sInvTypCd;
    }
    
    public void setTranStat(String cTranStat){
        this.cTranStat = cTranStat;
    }
    public String getTranStat(){
        return cTranStat;
    }
       
    public void setPrepared(String sPrepared){
        this.sPrepared = sPrepared;
    }
    public String getPrepared(){
        return sPrepared;
    }
    
    public void setPrepared(Date dPrepared){
        this.dPrepared = dPrepared;
    }
    public Date getPreparedDate(){
        return dPrepared;
    }
    
    public void setApproved(String sApproved){
        this.sApproved = sApproved;
    }
    public String getApproved(){
        return sApproved;
    }
    
    public void setApproved(Date dApproved){
        this.dApproved = dApproved;
    }
    public Date getApprovedDate(){
        return dApproved;
    }
    
    public void setAprvCode(String sAprvCode){
        this.sAprvCode = sAprvCode;
    }
    public String getAprvCode(){
        return sAprvCode;
    }
    
    public void setPostedxx(String sPostedxx){
        this.sPostedxx = sPostedxx;
    }
    public String getPostedxx(){
        return sPostedxx;
    }
    
    public void setPostedxx(Date dPostedxx){
        this.dPostedxx = dPostedxx;
    }
    public Date getPostedxxDate(){
        return dPostedxx;
    }
    
    public void setModified(String sModified){
        this.sModified = sModified;
    }
    public String getModified(){
        return sModified;
    }
    
    public void setModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getModifiedDate(){
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
        if (!(object instanceof UnitSalesReturnMaster)) {
            return false;
        }
        UnitSalesReturnMaster other = (UnitSalesReturnMaster) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.sales.pojo.UnitSalesReturnMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sBranchCd;
            case 3: return dTransact;
            case 4: return sClientID;
            case 5: return sRemarksx;
            case 6: return nTranTotl;
            case 7: return nVATRatex;
            case 8: return nDiscount;
            case 9: return nAddDiscx;
            case 10: return nFreightx;
            case 11: return nAmtPaidx;
            case 12: return sSourceNo;
            case 13: return sSourceCd;
            case 14: return nEntryNox;
            case 15: return sInvTypCd;
            case 16: return cTranStat;
            case 17: return sPrepared;
            case 18: return dPrepared;
            case 19: return sApproved;
            case 20: return dApproved;
            case 21: return sAprvCode;
            case 22: return sPostedxx;
            case 23: return dPostedxx;
            case 24: return sModified;
            case 25: return dModified;
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
        return "Sales_Return_Master";
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
            case 2: sBranchCd = (String) foValue; break;
            case 3: dTransact = (Date) foValue; break;
            case 4: sClientID = (String) foValue; break;
            case 5: sRemarksx = (String) foValue; break;
            case 6: nTranTotl = (Number) foValue; break;
            case 7: nVATRatex = (Number) foValue; break;
            case 8: nDiscount = (Number) foValue; break;
            case 9: nAddDiscx = (Number) foValue; break;
            case 10: nFreightx = (Number) foValue; break;
            case 11: nAmtPaidx = (Number) foValue; break;
            case 12: sSourceNo = (String) foValue; break;
            case 13: sSourceCd = (String) foValue; break;
            case 14: nEntryNox = (int) foValue; break;
            case 15: sInvTypCd = (String) foValue; break;
            case 16: cTranStat = (String) foValue; break;
            case 17: sPrepared = (String) foValue; break;
            case 18: dPrepared = (Date) foValue; break;
            case 19: sApproved = (String) foValue; break;
            case 20: dApproved = (Date) foValue; break;
            case 21: sAprvCode = (String) foValue; break;
            case 22: sPostedxx = (String) foValue; break;
            case 23: dPostedxx = (Date) foValue; break;
            case 24: sModified = (String) foValue; break;
            case 25: dModified = (Date) foValue; break;
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
