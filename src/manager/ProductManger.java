package manager;

import model.Product;

import javax.rmi.CORBA.Stub;
import java.util.ArrayList;

public class ProductManger implements IManager
        <Product> {
    ArrayList<Product> List;
    public ProductManger() {
        this.List=new ArrayList<>();
    }
    @Override
    public void add(Product product) {
        List.add(product);
    }

    @Override
    public void delete(int id) {
        int index=findIndexById(id);
        List.remove(index);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < List.size(); i++) {
             if (List.get(i).getId() == id) {
                 return i;
             }
        }
        return -1;
    }


    @Override
    public void edit(int id, Product product) {
        int index = findIndexById(id);
        List.set(index, product);

    }

    @Override
    public ArrayList<Product> findAll() {
        return List;
    }
}
