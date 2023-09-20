package edu.wgu.d387_sample_code.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "Reservation")
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private LocalDate checkin;

    @NotNull
    private LocalDate checkout;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private RoomEntity roomEntity;

    public ReservationEntity() {
    }

    public ReservationEntity(LocalDate checkin, LocalDate checkout, RoomEntity roomEntity) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.roomEntity = roomEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public RoomEntity getRoomEntity() {
        return roomEntity;
    }

    public void setRoomEntity(RoomEntity roomEntity) {
        this.roomEntity = roomEntity;
    }

    @Override
    public String toString() {
        return "ReservationEntity{" +
                "id=" + id +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                ", roomEntity=" + roomEntity +
                '}';
    }
}