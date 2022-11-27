package kodlama.io.RentACar.dataAccess.concretes;

import kodlama.io.RentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.RentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository  // This class is DataAccess object

public class InMemoryBrandRepository implements BrandRepository {



    List<Brand> brands;
    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "MERCEDES"));
        brands.add(new Brand(3, "AUIDI"));
        brands.add(new Brand(4, "FIAT"));
        brands.add(new Brand(5, "RENAULT"));

    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
