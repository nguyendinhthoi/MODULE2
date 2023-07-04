package case_study.service.facility;

import case_study.model.facility.Facility;
import case_study.repository.facility.FacilityRepository;
import case_study.repository.facility.IFacilityRepository;

import java.util.Map;

import static case_study.view.Run.scanner;

public class FacilityService implements IFacilityService {
    IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public void displayFacility() {
        int choice = 0;
        do {
            try {
                System.out.print("You want to show list:\n" +
                        "1.House\n" +
                        "2.Villa\n" +
                        "3.Room\n" +
                        "choose here : ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please Enter Number... Try Again!!");
            }
        } while (choice <= 0 || choice > 3);
        Map<Facility, Integer> display = iFacilityRepository.displayFacility(choice);
        for (Map.Entry<Facility, Integer> s : display.entrySet()) {
            System.out.println(s);
        }
    }

    @Override
    public void addFacility() {
        int choice = 0;
        do {
            try {
                System.out.print("You want to add :\n" +
                        "1. New House\n" +
                        "2. New Villa\n" +
                        "3. New Room\n" +
                        "4. Back to Menu\n" +
                        "choose here : ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        iFacilityRepository.addFacility(choice, ListHouse.addHouse());
                        break;
                    case 2:
                        iFacilityRepository.addFacility(choice, ListVilla.addVilla());
                        break;
                    case 3:
                        iFacilityRepository.addFacility(choice, ListRoom.addRoom());
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Function not Found!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please Enter Number... Try Again!!");
            }
        } while (choice < 0 || choice > 3);
    }

    @Override
    public void displayMaintance() {

    }
}
