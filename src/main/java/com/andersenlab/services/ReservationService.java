package com.andersenlab.services;



import com.andersenlab.dto.ReservationDTO;
import com.andersenlab.dto.ReservationPostDTO;

import java.util.List;

/**Интерфейс служит для определения сервисных функций по работе с бронированиями.
 @author Артемьев Р.А.
 @version 09.03.2020 */
public interface ReservationService {

     /**Метод возвращает список всех бронирований.
     @return список объектов класса ReservationDTO*/
     List<ReservationDTO> findAllReservations();

     /**Метод возвращает объект бронирования по его id
      @param id id бронирования
      @return объект класса ReservationDTO*/
     ReservationDTO findReservationById(Long id);

     /**Метод возвращает список объектов бронирования по id пользователя
      @param id id пользователя
      @return список объектов класса ReservationDTO*/
     List<ReservationDTO> findReservationsByPersonId(Long id);

     /**Метод возвращает список объектов бронирования по id номера в отеле
      @param id id номера
      @return список объектов класса ReservationDTO*/
     List<ReservationDTO> findReservationsByRoomId(Long id);

     /**Метод сохраняет бронирование номера
      @param reservationPostDTO объект бронирования, который нужно сохранить
      @return объект бронирования в базе*/
     ReservationPostDTO saveReservation(ReservationPostDTO reservationPostDTO);

     /**Метод удаляет объект бронирования по id
      @param id бронирования, которого нужно удалить
      @return id удалённого бронирования*/
      Long deleteReservation(Long id);
}
