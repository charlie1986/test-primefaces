package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.SelectEvent;

@Named
@ViewScoped
public class ContractBean implements Serializable {

    @Getter
    private List<Contractvendor> contractvendors;
    @Getter
    @Setter
    private Contractvendor selectedContractvendor;

    @PostConstruct
    public void init() {
        contractvendors = new ArrayList<>();
        contractvendors.add(new Contractvendor("VD01"));
        contractvendors.add(new Contractvendor("VD02"));
    }

    public void onContractVendorCellEdit(CellEditEvent event) {
    }

    public void rowSelectContractVendor(SelectEvent event) {
    }

    public void rowUnSelectContractVendor(SelectEvent event) {
    }
}
