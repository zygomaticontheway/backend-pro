package staff.administration;

import org.springframework.beans.factory.annotation.Autowired;
import staff.production.MachineOperator;
import staff.production.Merchandiser;
import staff.production.SalesManager;
import staff.production.StoreKeeper;

public class SalesChief {
    @Autowired
    private SalesManager salesManager;
    @Autowired
    private Merchandiser merchandiser;

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }

    public void setMerchandiser(Merchandiser merchandiser) {
        this.merchandiser = merchandiser;
    }

    public void giveOrders () {
        salesManager.work();
        merchandiser.work();
    }
}

