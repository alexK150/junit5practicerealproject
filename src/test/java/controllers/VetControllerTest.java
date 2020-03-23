package controllers;

import fauxspring.Model;
import fauxspring.ModelMapImpl;
import model.Vet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.SpecialtyService;
import services.VetService;
import services.map.SpecialityMapService;
import services.map.VetMapService;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class VetControllerTest {
    private VetService vetService;
    private SpecialtyService specialtyService;
    private VetController controller;

    @BeforeEach
    @Test
    void setUp() {
        specialtyService = new SpecialityMapService();
        vetService = new VetMapService(specialtyService);
        controller = new VetController(vetService);

        Vet vet1 = new Vet(1L, "Vet1", "Vet1", null);
        Vet vet2 = new Vet(2L, "Vet2", "Vet2", null);

        vetService.save(vet1);
        vetService.save(vet2);
    }

    @Test
    void listVets() {
        Model model = new ModelMapImpl();
        String view = controller.listVets(model);

        assertThat("vets/index").isEqualTo(view);

        Set modelAttribute = (Set) ((ModelMapImpl) model).getMap().get("vets");
        assertThat(modelAttribute.size()).isEqualTo(2);
    }
}