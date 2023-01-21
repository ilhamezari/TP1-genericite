package TP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface Imetier<T> {
    void add (T o);

    public List<T> getAll();
    public T FindBYID(long id);
     void delete (long id);





}




