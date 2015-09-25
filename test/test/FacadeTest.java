/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Person;
import facade.Facade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jeanette
 */
public class FacadeTest
{
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    private Facade f = new Facade();
    public FacadeTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
         
    }
    
    @Test
    public void testAddPerson()
    {
        Person p = new Person(5, "test", "test", "test");
        Person p2 = f.addPerson(p);
        assertEquals(p, p2);
    }
    
    @Test
    public void testDeletePerson()
    {
        Person p = f.deletePerson(5);
        assertNull(p);
    }
}
