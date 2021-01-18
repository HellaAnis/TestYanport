package main;

import org.junit.Assert;
import org.junit.Test;

public class main {

    @Test
    public void test1() throws Exception {
        Aspirateur aspirateur = new Aspirateur(5,5,'N');
        String s ="DADADADAA";
        int n =10; //dimension de grill
        int m =10;

        Main.aspirateurTravel(s,aspirateur,n,m);

        Assert.assertEquals(aspirateur.getX(),5);
        Assert.assertEquals(aspirateur.getY(),6);
        Assert.assertEquals(aspirateur.getD(),'N');
    }

}
