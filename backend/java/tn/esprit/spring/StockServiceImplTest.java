package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.StockService;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest
public class StockServiceImplTest {
	@Autowired
	StockService stockService;

	@Test
	@Order(1)
	public void testRetrieveAllStocks() {
		List<Stock> allStocks = stockService.retrieveAllStock();
		assertEquals(8, allStocks.size());
	}

//	@Test
//	@Order(2)
//	public void testAddStock() {
//		Stock s = new Stock("stock test", 10, 100);
//		Stock savedStock = stockService.addStock(s);
//		assertEquals(s.getLibelleStock(), savedStock.getLibelleStock());
//	}

//	@Test
//	@Order(3)
//	public void testRetrieveStock() {
//		Stock stock = stockService.retrieveStock(1L);
//		assertEquals(1L, stock.getIdStock().longValue());
//	}

	@Test
	@Order(4)
	public void testDeleteStock() {
		stockService.deleteStock(10L);
		assertNull(stockService.retrieveStock(10L));
	}

}