public class Main
{
        public static void main(String[] args) {
            //get Tissue factory
            AbstractFactory TissueFactory = FactoryProducer.getFactory();
       
        //get an object of FacialTissue
        Tissue t1 = TissueFactory.getTissue("FACE");
        
        //call print method of FacialTissue
        t1.print();
        
        //get an object of BathTissue 
        Tissue t2 = TissueFactory.getTissue("BATH");
        
        //call print method of BathTissue
        t2.print();
        }
}
