package staff.administration;

import staff.production.MachineOperator;
import staff.production.Merchandiser;
import staff.production.SalesManager;
import staff.production.StoreKeeper;

public class SalesChief {
    private SalesManager salesManager;
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

