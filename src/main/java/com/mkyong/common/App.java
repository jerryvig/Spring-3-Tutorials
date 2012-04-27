package com.mkyong.common;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.model.Stock;
 
public class App {
    public static void main( String[] args ) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
 
	StockBo stockBo = (StockBo)context.getBean("stockBo");
        
        Stock stock = new Stock();
	stock.setStockCode("7668");
        stock.setStockName("HAIO");
        stockBo.save(stock);

        Stock stock2 = stockBo.findByStockCode("7668");
        System.out.println( stock2 );

        stock2.setStockName("HAIO-1");
        stockBo.update(stock2);

        stockBo.delete(stock2);

        System.out.println( "done!" );
    }
}