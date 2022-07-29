package digital.gayan.roomwebproject.controllers;

import digital.gayan.roomwebproject.models.Room;
import digital.gayan.roomwebproject.services.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model){

        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}
