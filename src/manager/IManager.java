//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package manager;

import java.util.ArrayList;

public interface IManager<E> {
    void add(E var1);

    void delete(int var1);

    int findIndexById(int var1);

    void edit(int var1, E var2);

    ArrayList<E> findAll();
}
