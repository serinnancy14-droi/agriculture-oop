class Crop {
    String name;
    double areaAcres;

    Crop(String name, double areaAcres) {
        this.name = name;
        this.areaAcres = areaAcres;
    }

    void display() {
        System.out.println("Crop Name: " + name);
        System.out.println("Area: " + areaAcres + " acres");
    }
}

class OrganicCrop extends Crop {
    String certificationBody;

    OrganicCrop(String name, double areaAcres, String certificationBody) {
        super(name, areaAcres);
        this.certificationBody = certificationBody;
    }

    @Override
    void display() {
        System.out.println("Crop Name: " + name);
        System.out.println("Area: " + areaAcres + " acres");
        System.out.println("Certification Body: " + certificationBody);
    }
}

public class Agriculture {
    public static void main(String[] args) {
        OrganicCrop crop = new OrganicCrop(
            "Rice", 5.5, "Tamil Nadu Organic Certification"
        );

        crop.display();
    }
}
