
package dao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Cloth;

@Stateless
public class ClothManager {
    
    @PersistenceContext
    EntityManager em;
    
    
    
     // Add by id
  public void addCloth(Cloth c){
      em.persist(c);
  }
   //Delete by id
    public void deleteCloth(Long id){
        Cloth p = em.find(Cloth.class, id);
        em.remove(p); 
  } 
   //Find by id
    public Cloth findbyId(Long id){
        Cloth c= em.find(Cloth.class,id);          
        return c;
    }  
    
    public void nameUpdate(Long id, String name) {
        Cloth c1 = em.find(Cloth.class,id);
        c1.setName(name);
        em.persist(c1);
    }
  //List all clothes 
  public List<Cloth> getAllCloths(){
      Query q = em.createQuery("SELECT c from Cloth c");
      return q.getResultList();
  }
   public Cloth getCloth(Long id){
     Cloth c= em.find(Cloth.class,id);
          
      return c;
  }
        
    
}

