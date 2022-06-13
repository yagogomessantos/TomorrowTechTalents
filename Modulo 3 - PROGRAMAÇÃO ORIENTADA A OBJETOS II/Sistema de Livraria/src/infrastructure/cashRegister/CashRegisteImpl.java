package infrastructure.cashRegister;

import domain.model.CashRegister;
import domain.model.Product;
import domain.model.Stock;
import domain.repository.ProductRepository;

import java.util.List;

public class CashRegisteImpl implements CashRegister {

    private Stock stock;
    private Double balance;
    private ProductRepository productRepository;

    public CashRegisteImpl(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void buy(List<String> productIds) {
        for (String id: productIds) {

        }

    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
