package com.mkyong.stock.model;

import java.io.Serializable;

public class Stock implements Serializable {
   private static final long serialVersionUID = 1L;
   
   private Long stockId;
   private String stockCode;
   private String stockName;

   public void setStockId( Long _stockId ) {
       stockId = _stockId;
   } 

   public Long getStockId() {
	return stockId;
   }

   public void setStockCode( String _stockCode ) { 
       stockCode = _stockCode; 
   }

    public void setStockName( String _stockName ) {
	stockName = _stockName;
    }

    public String getStockCode() { return stockCode; }
    public String getStockName() { return stockName; }
}