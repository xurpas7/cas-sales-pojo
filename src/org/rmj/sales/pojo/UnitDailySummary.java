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
import org.rmj.appdriver.constants.TransactionStatus;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Daily_Summary")

public class UnitDailySummary implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTranDate")
    private String sTranDate;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sCRMNumbr")
    private String sCRMNumbr;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sCashierx")
    private String sCashierx;
    
    @Column(name = "nOpenBalx")
    private Number nOpenBalx;
    
    @Column(name = "nCPullOut")
    private Number nCPullOut;
    
    @Column(name = "nSalesAmt")
    private Number nSalesAmt;
    
    @Column(name = "nVATSales")
    private Number nVATSales;
    
    @Column(name = "nVATAmtxx")
    private Number nVATAmtxx;
    
    @Column(name = "nNonVATxx")
    private Number nNonVATxx;
    
    @Column(name = "nZeroRatd")
    private Number nZeroRatd;
    
    @Column(name = "nDiscount")
    private Number nDiscount;
    
    @Column(name = "nVatDiscx")
    private Number nVatDiscx;
    
    @Column(name = "nPWDDiscx")
    private Number nPWDDiscx;
    
    @Column(name = "nReturnsx")
    private Number nReturnsx;
    
    @Column(name = "nVoidAmnt")
    private Number nVoidAmnt;
    
    @Column(name = "nAccuSale")
    private Number nAccuSale;
    
    @Column(name = "nCashAmnt")
    private Number nCashAmnt;
    
    @Column(name = "nChckAmnt")
    private Number nChckAmnt;
    
    @Column(name = "nCrdtAmnt")
    private Number nCrdtAmnt;
    
    @Column(name = "nChrgAmnt")
    private Number nChrgAmnt;
    
    @Column(name = "nGiftAmnt")
    private Number nGiftAmnt;
    
    @Column(name = "nFinAmntx")
    private Number nFinAmntx;
    
    @Column(name = "sORNoFrom")
    private String sORNoFrom;
    
    @Column(name = "sORNoThru")
    private String sORNoThru;
    
    @Column(name = "dOpenedxx")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dOpenedxx;
    
    @Column(name = "dClosedxx")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dClosedxx;
    
    @Column(name = "nZReadCtr")
    private int nZReadCtr;
    
    @Column(name = "cTranStat")
    private String cTranStat;

    LinkedList laColumns = null;
    
    public UnitDailySummary(){
        sTranDate = "";
        sCRMNumbr = "";
        sCashierx = "";
        nOpenBalx = 0.00;
        nCPullOut = 0.00;
        nSalesAmt = 0.00;
        nVATSales = 0.00;
        nVATAmtxx = 0.00;
        nNonVATxx = 0.00;
        nZeroRatd = 0.00;
        nDiscount = 0.00;
        nVatDiscx = 0.00;
        nPWDDiscx = 0.00;
        nReturnsx = 0.00;
        nVoidAmnt = 0.00;
        nAccuSale = 0.00;
        nCashAmnt = 0.00;
        nChckAmnt = 0.00;
        nCrdtAmnt = 0.00;
        nChrgAmnt = 0.00;
        nGiftAmnt = 0.00;
        nFinAmntx = 0.00;
        sORNoFrom = "";
        sORNoThru = "";
        dOpenedxx = null;
        dClosedxx = null;
        nZReadCtr = 0;
        cTranStat = TransactionStatus.STATE_OPEN;
        
        laColumns = new LinkedList();
        laColumns.add("sTranDate");
        laColumns.add("sCRMNumbr");
        laColumns.add("sCashierx");
        laColumns.add("nOpenBalx");
        laColumns.add("nCPullOut");
        laColumns.add("nSalesAmt");
        laColumns.add("nVATSales");
        laColumns.add("nVATAmtxx");
        laColumns.add("nNonVATxx");
        laColumns.add("nZeroRatd");
        laColumns.add("nDiscount");
        laColumns.add("nVatDiscx");
        laColumns.add("nPWDDiscx");
        laColumns.add("nReturnsx");
        laColumns.add("nVoidAmnt");
        laColumns.add("nAccuSale");
        laColumns.add("nCashAmnt");
        laColumns.add("nChckAmnt");
        laColumns.add("nCrdtAmnt");
        laColumns.add("nChrgAmnt");
        laColumns.add("nGiftAmnt");
        laColumns.add("nFinAmntx");
        laColumns.add("sORNoFrom");
        laColumns.add("sORNoThru");
        laColumns.add("dOpenedxx");
        laColumns.add("dClosedxx");
        laColumns.add("nZReadCtr");
        laColumns.add("cTranStat");
    }
    
    public void setTransactionDate(String fsValue){
        sTranDate = fsValue;
    }
    public String getTransactionDate(){
        return sTranDate;
    }
    
    public void setMachineNo(String fsValue){
        sCRMNumbr = fsValue;
    }
    public String getMachineNo(){
        return sCRMNumbr;
    }
    
    public void setCashier(String fsValue){
        sCashierx = fsValue;
    }
    public String getCashier(){
        return sCashierx;
    }
    
    public void setOpeningBalance(Number fnValue){
        nOpenBalx = fnValue;
    }
    public Number getOpeningBalance(){
        return nOpenBalx;
    }
    
    public void setCashPullout(Number fnValue){
        nCPullOut = fnValue;
    }
    public Number getCashPullout(){
        return nCPullOut;
    }
    
    public void setSalesAmount(Number fnValue){
        nSalesAmt = fnValue;
    }
    public Number getSalesAmount(){
        return nSalesAmt;
    }
    
    public void setVATableSales(Number fnValue){
        nVATSales = fnValue;
    }
    public Number getVATableSales(){
        return nVATSales;
    }
    
    public void setVATAmount(Number fnValue){
        nVATAmtxx = fnValue;
    }
    public Number getVATAmount(){
        return nVATAmtxx;
    }
    
    public void setNonVATAmount(Number fnValue){
        nNonVATxx = fnValue;
    }
    public Number getNonVATAmount(){
        return nNonVATxx;
    }
    
    public void setZeroRatedSales(Number fnValue){
        nZeroRatd = fnValue;
    }
    public Number getZeroRatedSales(){
        return nZeroRatd;
    }
    
    public void setDiscount(Number fnValue){
        nDiscount = fnValue;
    }
    public Number getDiscount(){
        return nDiscount;
    }
    
    public void setVATDisc(Number fnValue){
        nVatDiscx = fnValue;
    }
    public Number getVATDisc(){
        return nVatDiscx;
    }
    
    public void setPWDDisc(Number fnValue){
        nPWDDiscx = fnValue;
    }
    public Number getPWDDisc(){
        return nPWDDiscx;
    }
    
    public void setReturns(Number fnValue){
        nReturnsx = fnValue;
    }
    public Number getReturnAmount(){
        return nReturnsx;
    }
        
    public void setVoidAmount(Number fnValue){
        nVoidAmnt = fnValue;
    }
    public Number getVoidAmount(){
        return nVoidAmnt;
    }
    
    public void setAccumulatedSale(Number fnValue){
        nAccuSale = fnValue;
    }
    public Number getAccumulatedSale(){
        return nAccuSale;
    }
    
    public void setCashAmount(Number fnValue){
        nCashAmnt = fnValue;
    }
    public Number getCashAmount(){
        return nCashAmnt;
    }
    
    public void setCheckAmount(Number fnValue){
        nChckAmnt = fnValue;
    }
    public Number getCheckAmount(){
        return nChckAmnt;
    }
    
    public void setCreditCardAmount(Number fnValue){
        nCrdtAmnt = fnValue;
    }
    public Number getCreditCardAmount(){
        return nCrdtAmnt;
    }
    
    public void setChargeInvoiceAmount(Number fnValue){
        nChrgAmnt = fnValue;
    }
    public Number getChargeInvoiceAmount(){
        return nChrgAmnt;
    }
    
    public void setGiftAmount(Number fnValue){
        nGiftAmnt = fnValue;
    }
    public Number getGiftAmount(){
        return nGiftAmnt;
    }
    
    public void setFinanceAmount(Number fnValue){
        nFinAmntx = fnValue;
    }
    public Number getFinanceAmount(){
        return nFinAmntx;
    }
    
    public void setORFrom(String fsValue){
        sORNoFrom = fsValue;
    }
    public String getORFrom(){
        return sORNoFrom;
    }
    
    public void setORThru(String fsValue){
        sORNoThru = fsValue;
    }
    public String getORThru(){
        return sORNoThru;
    }
    
    public void setDateOpened(Date fdValue){
        dOpenedxx = fdValue;
    }
    public Date getDateOpened(){
        return dOpenedxx;
    }
    
    public void setDateClosed(Date fdValue){
        dClosedxx = fdValue;
    }
    public Date getDateClosed(){
        return dClosedxx;
    }
    
    public void setZReadingCounter(int fnValue){
        nZReadCtr = fnValue;
    }
    public int getZReadingCounter(){
        return nZReadCtr;
    }
    
    public void setTranStat(String fsValue){
        cTranStat = fsValue;
    }
    public String getTranStat(){
        return cTranStat;
    }
    
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sTranDate != null ? sTranDate.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitDailySummary)) {
            return false;
        }
        UnitDailySummary other = (UnitDailySummary) object;
        if ((this.sTranDate == null && other.sTranDate != null) || (this.sTranDate != null && !this.sTranDate.equals(other.sTranDate)) &&
                (this.sCRMNumbr == null && other.sCRMNumbr != null) || (this.sCRMNumbr != null && !this.sCRMNumbr.equals(other.sCRMNumbr)) &&
                (this.sCashierx == null && other.sCashierx != null) || (this.sCashierx != null && !this.sCashierx.equals(other.sCashierx))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +  "[sTranDate=" + sTranDate + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1 : return sTranDate;
            case 2 : return sCRMNumbr;
            case 3 : return sCashierx;
            case 4 : return nOpenBalx;
            case 5 : return nCPullOut;
            case 6 : return nSalesAmt;
            case 7 : return nVATSales;
            case 8 : return nVATAmtxx;
            case 9 : return nNonVATxx;
            case 10 : return nZeroRatd;
            case 11 : return nDiscount;
            case 12 : return nVatDiscx;
            case 13 : return nPWDDiscx;
            case 14 : return nReturnsx;
            case 15 : return nVoidAmnt;
            case 16 : return nAccuSale;
            case 17 : return nCashAmnt;
            case 18 : return nChckAmnt;
            case 19 : return nCrdtAmnt;
            case 20 : return nChrgAmnt;
            case 21 : return nGiftAmnt;
            case 22 : return nFinAmntx;
            case 23 : return sORNoFrom;
            case 24 : return sORNoThru;
            case 25 : return dOpenedxx;
            case 26 : return dClosedxx;
            case 27 : return nZReadCtr;
            case 28 : return cTranStat;
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
        return "Daily_Summary";
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
            case 1 : sTranDate = (String) foValue; break;
            case 2 : sCRMNumbr = (String) foValue; break;
            case 3 : sCashierx = (String) foValue; break;
            case 4 : nOpenBalx = (Number) foValue; break;
            case 5 : nCPullOut = (Number) foValue; break;
            case 6 : nSalesAmt = (Number) foValue; break;
            case 7 : nVATSales = (Number) foValue; break;
            case 8 : nVATAmtxx = (Number) foValue; break;
            case 9 : nNonVATxx = (Number) foValue; break;
            case 10 : nZeroRatd = (Number) foValue; break;
            case 11 : nDiscount = (Number) foValue; break;
            case 12 : nVatDiscx = (Number) foValue; break;
            case 13 : nPWDDiscx = (Number) foValue; break;
            case 14 : nReturnsx = (Number) foValue; break;
            case 15 : nVoidAmnt = (Number) foValue; break;
            case 16 : nAccuSale = (Number) foValue; break;
            case 17 : nCashAmnt = (Number) foValue; break;
            case 18 : nChckAmnt = (Number) foValue; break;
            case 19 : nCrdtAmnt = (Number) foValue; break;
            case 20 : nChrgAmnt = (Number) foValue; break;
            case 21 : nGiftAmnt = (Number) foValue; break;
            case 22 : nFinAmntx = (Number) foValue; break;
            case 23 : sORNoFrom = (String) foValue; break;
            case 24 : sORNoThru = (String) foValue; break;
            case 25 : dOpenedxx = (Date) foValue; break;
            case 26 : dClosedxx = (Date) foValue; break;
            case 27 : nZReadCtr = (int) foValue; break;
            case 28 : cTranStat = (String) foValue; break;
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