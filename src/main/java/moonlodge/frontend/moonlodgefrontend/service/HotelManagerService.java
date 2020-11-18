package moonlodge.frontend.moonlodgefrontend.service;

import moonlodge.frontend.moonlodgefrontend.contract.dto.BookingDTO;
import moonlodge.frontend.moonlodgefrontend.contract.dto.VacantHotelRoomDTO;
import moonlodge.frontend.moonlodgefrontend.contract.entitys.Room;
import moonlodge.frontend.moonlodgefrontend.contract.interfaces.HotelManagerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;


@Component
public class HotelManagerService implements HotelManagerInterface {


    private HotelManagerInterface hotelManagerService;

    @Autowired
    HotelManagerService(@Value("remoteEngine") String remoteEngine) throws RemoteException, NotBoundException, MalformedURLException {
        this.hotelManagerService = (HotelManagerInterface) Naming.lookup(remoteEngine);
    }

    @Override
    public List<VacantHotelRoomDTO> getHotelRoomList(String city, Date dateFrom, Date dateTo, int numberGuests, int numberRooms) throws RemoteException {
        return this.hotelManagerService.getHotelRoomList(city, dateFrom, dateTo,  numberGuests, numberRooms);
    }

    @Override
    public BookingDTO createBooking(List<Room> rooms, String[] passportNumbers, Date dateFrom, Date dateTo, boolean arrivalIsLate) throws RemoteException {
        return this.hotelManagerService.createBooking(rooms, passportNumbers, dateFrom, dateTo, arrivalIsLate);
    }

    @Override
    public List<BookingDTO> findBookings(String passportNumber) throws RemoteException {
        return this.hotelManagerService.findBookings(passportNumber);
    }

    @Override
    public boolean cancelBooking(long bookingId) throws RemoteException {
        return this.hotelManagerService.cancelBooking(bookingId);
    }
}

