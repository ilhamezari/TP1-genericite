package TP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierproduitImpl implements Imetier<produit>{
    public static void main(String[] args) {
        File file = new File("fichierp.txt");
    }

    public List<produit> listP = new ArrayList();


    @Override
    public void add(produit o) {

    if (FindBYID(o.getId()) == null)
        listP.add(o);
    else
      System.out.println("existe deja!");

    }

    @Override
    public List<produit> getAll() {
        return listP;
    }


    @Override
    public produit FindBYID(long id) {
        for (produit p:listP){
            if (p.getId()==id)
                return p;
        }

        return null;
    }

    @Override
    public void delete(long id) {
            produit p1 = FindBYID(id);
            if (p1!=null)
                listP.remove(p1);
        }



    }


