
package controller;

import dao.ClothManager;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import model.Cloth;


@Named(value = "clothController")
@RequestScoped
public class ClothController {
    
    @Inject
    ClothManager cm;
    
    private Long id2;
    private Long id; 
    private String name;
    private Double price;
    private String description;
    private String origin;
    private List<Cloth> allCloths;
    private Cloth Cloth1;
  
    
    public ClothController() {
    }
     //Add
    public void submit(){
        Cloth c = new Cloth(name,price,description,origin);
        cm.addCloth(c); 
      
    }
    //ShowAll
    public void showAll(){
      allCloths=cm.getAllCloths(); 
    } 
    
    //Show cloth by id  
    public void showCloth(){
    Cloth1 = cm.getCloth(id2);
    }  
    //Delete
    public void delete(){
       cm.deleteCloth(id);
    }
    
    public void upDate(){
//       Cloth c = new Cloth(name, price, description,origin); 
       cm.nameUpdate(id2, name);
//       c = cm.findbyId(id);
//       c.setName(name);
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public List<Cloth> getAllCloths() {
        return allCloths;
    }

    public void setAllCloths(List<Cloth> allCloths) {
        this.allCloths = allCloths;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId2() {
        return id2;
    }

    public void setId2(Long id2) {
        this.id2 = id2;
    }

    public Cloth getCloth1() {
        return Cloth1;
    }

    public void setCloth1(Cloth Cloth1) {
        this.Cloth1 = Cloth1;
    }
    
  
}
 

