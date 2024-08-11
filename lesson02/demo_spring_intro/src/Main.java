import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import staff.administration.Director;
import staff.administration.ProductionChief;
import staff.administration.SalesChief;
import staff.production.MachineOperator;
import staff.production.Merchandiser;
import staff.production.SalesManager;
import staff.production.StoreKeeper;

public class Main {
    public static void main(String[] args) {

//        MachineOperator machineOperator = new MachineOperator();
//        Merchandiser merchandiser = new Merchandiser();
//        SalesManager salesManager = new SalesManager();
//        StoreKeeper storeKeeper = new StoreKeeper();
//
//        ProductionChief productionChief = new ProductionChief();
//            productionChief.setMachineOperator(machineOperator);
//            productionChief.setStoreKeeper(storeKeeper);
//
//        SalesChief salesChief = new SalesChief();
//            salesChief.setSalesManager(salesManager);
//            salesChief.setMerchandiser(merchandiser);
//
//        Director director = new Director();
//            director.setProductionChief(productionChief);
//            director.setSalesChief(salesChief);
//
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(".configuration");

        // вызов бина по классу, объект рефлексии
//        Director director = context.getBean(Director.class);

        // вызов бина по имени, нужно привести тип
        Director director = (Director) context.getBean("director");

        director.manageCompany();
        
    }
}