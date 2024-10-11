public interface TaxMethod {
    int tax();      // 기본세
    int edu_tax();  // 교육세
    int eco_tax();  // 환경세

    default int total_tax() {
        return tax() + edu_tax() + eco_tax();
    }
}
