package kodlama.io.RentACar.business.concretes;

import kodlama.io.RentACar.business.abstracts.BrandService;
import kodlama.io.RentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.RentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //this class is a business object
public class BrandManager implements BrandService {


    private BrandRepository brandRepository;
    @Autowired


    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
    public List<Brand> getAll() {
        // business rules to get getAll
        return brandRepository.getAll();
    }
}
