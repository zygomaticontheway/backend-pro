package staff.administration;

import org.springframework.beans.factory.annotation.Autowired;
import staff.production.MachineOperator;
import staff.production.StoreKeeper;

public class ProductionChief {
    @Autowired
    private MachineOperator machineOperator;
    @Autowired
    private StoreKeeper storeKeeper;

    public void setMachineOperator(MachineOperator machineOperator) {
        this.machineOperator = machineOperator;
    }

    public void setStoreKeeper(StoreKeeper storeKeeper) {
        this.storeKeeper = storeKeeper;
    }

    public void giveOrders () {
        machineOperator.work();
        storeKeeper.work();
    }
}

