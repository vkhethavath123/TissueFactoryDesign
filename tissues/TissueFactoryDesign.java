//creating an interface of tissue
interface Tissue{
    void print();
}

//concrete class FacialTissue implementing interface Tissue
class FacialTissue implements Tissue{
    
    @Override //implementing method print()
    public void print(){
        System.out.println("Tissue for face!!");
    }
}

//concrete class BathTissue implementing interface Tissue
class BathTissue implements Tissue{
    
    @Override //implementing method print()
    public void print(){
        System.out.println("Tissue for bathroom!!");
    }
}

//creating abstract class for factories for Tissue objects
abstract class AbstractFactory{
    abstract Tissue getTissue(String typeTissue);
}

//factory class that extends AbstractFactory
class TissueFactory extends AbstractFactory{
    @Override
    public Tissue getTissue(String typeTissue){    
        if(typeTissue.equalsIgnoreCase("FACE")){
            return new FacialTissue();         
        }
        else if(typeTissue.equalsIgnoreCase("BATH")){
            return new BathTissue();
        }        
      return null;
    }
}

//factory produce for factories by passing Tissue
class FactoryProducer{
    public static AbstractFactory getFactory(){
        return new TissueFactory();
    }
}

