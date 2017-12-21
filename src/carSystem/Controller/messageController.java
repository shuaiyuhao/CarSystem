package carSystem.Controller;

import carSystem.Info.travelInfo;
import carSystem.logic.travelMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by shuaiyuhao on 2017/12/21.
 */
@Controller
public class messageController {
    @RequestMapping(value = "/pasTravel")
    public String pasTravel(@RequestParam("startDate") String startDate,@RequestParam("startPlace") String startPlace,@RequestParam("endPlace") String endPlace,@RequestParam("peopleNum") String peopleNum){
        travelMessage tm = new travelMessage();
        travelInfo travelinfo = new travelInfo();
        travelinfo.setstartDate(startDate);
        travelinfo.setstartPlace(startPlace);
        travelinfo.setendPlace(endPlace);
        travelinfo.setpeopleNum(peopleNum);
        tm.savePasTravel(travelinfo);
        return "index";
    }

    @RequestMapping(value = "/driTravel")
    public String driTravel(@RequestParam("startDate") String startDate,@RequestParam("startPlace") String startPlace,@RequestParam("endPlace") String endPlace,@RequestParam("sitNum") String sitNum){
        travelMessage tm = new travelMessage();
        travelInfo travelinfo = new travelInfo();
        travelinfo.setstartDate(startDate);
        travelinfo.setstartPlace(startPlace);
        travelinfo.setendPlace(endPlace);
        travelinfo.setsitNum(sitNum);
        tm.saveDriTravel(travelinfo);
        return "index";
    }


}
