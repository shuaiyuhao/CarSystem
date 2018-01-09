package carSystem.Controller;

import carSystem.Info.travelInfo;
import carSystem.Model.PassengerFormEntity;
import carSystem.logic.travelMessage;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import carSystem.logic.travelMessage;
import javax.servlet.http.HttpServletRequest;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import carSystem.service.*;

/**
 * Created by shuaiyuhao on 2017/12/21.
 */
@Controller
public class messageController {
//    @Autowired
//    private messageService messageservice;

    @RequestMapping(value = "/pasTravel")
    public String pasTravel(@RequestParam("startDate") String startDate, @RequestParam("startPlace") String startPlace, @RequestParam("endPlace") String endPlace, @RequestParam("peopleNum") String peopleNum) {
        travelMessage tm = new travelMessage();
        travelInfo travelinfo = new travelInfo();
        travelinfo.setstartDate(startDate);
        travelinfo.setstartPlace(startPlace);
        travelinfo.setendPlace(endPlace);
        travelinfo.setpeopleNum(peopleNum);
        tm.savePasTravel(travelinfo);
        tm.saveDriTravel(travelinfo);
        if (travelinfo != null) {
            return "sendSuccessful";
        } else {
            return "sendWrong";
        }
    }

    @RequestMapping(value = "/driTravel")
    public String driTravel(@RequestParam("startDate") String startDate, @RequestParam("startPlace") String startPlace, @RequestParam("endPlace") String endPlace, @RequestParam("sitNum") String sitNum) {
        travelMessage tm = new travelMessage();
        travelInfo travelinfo = new travelInfo();
        travelinfo.setstartDate(startDate);
        travelinfo.setstartPlace(startPlace);
        travelinfo.setendPlace(endPlace);
        travelinfo.setsitNum(sitNum);
        tm.saveDriTravel(travelinfo);
        if (travelinfo != null) {
            return "sendSuccessful";
        } else {
            return "sendWrong";
        }
    }

    @RequestMapping(value = "/SearchDriver")
    public String searchDriver(@RequestParam("keyword") String keyword,Model model){
        travelMessage a = new travelMessage();
        ArrayList<travelInfo> travelInfos =null;
        try{
            travelInfos = a.searchDriver(keyword);
        }catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("travelInfos",travelInfos);
        return "searchDriver";
    }

    @RequestMapping(value = "/SearchPassenger")
    public String searchPassenger(@RequestParam("keyword") String keyword,Model model){
        travelMessage a = new travelMessage();
        ArrayList<travelInfo> travelInfos =null;
        try{
            travelInfos = a.searchPassenger(keyword);
        }catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("travelInfos",travelInfos);
        return "searchPassenger";
    }

    @RequestMapping(value = "/showForm")
    public String showPassengerForm(HttpServletRequest request, Model model) {
        travelMessage a = new travelMessage();
        ArrayList<travelInfo> travelInfos = null;
        try{
            travelInfos = a.getPassengerForm();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("travelInfos", travelInfos);
        return "showForm";
    }

    @RequestMapping(value = "/showDriverForm")
    public String showDriverForm(Model model){
        travelMessage b = new travelMessage();
        ArrayList<travelInfo> travelInfos =null;
        try{
            travelInfos = b.getDriverForm();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("travelInfos", travelInfos);
        return "showDriverForm";
    }

}