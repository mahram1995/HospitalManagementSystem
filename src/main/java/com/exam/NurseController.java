package com.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.exam.doctor.DoctorDAO;
import com.exam.nurse.NurseDAO;
import com.exam.receptions.PatientDAO;


@Controller
public class NurseController {
	
	String doctorName="";
	@Autowired
	DoctorDAO doctors;
	@Autowired
	PatientDAO patient;
	@Autowired
	NurseDAO nrs;
	
	
	@RequestMapping("nurseHeader")
	public String admissionHeader() {
		return "headerAndFooter/nurseHeader";
	}
	
	@RequestMapping("nurseHome")
	public String nurseHome() {
		return "nurse_module/nurseHome";
	}
	
	@RequestMapping("thirdFloor")
	public String thirdFloor(Model model) {
		model.addAttribute("heading", "Admitted Patient");
		model.addAttribute("object", nrs.getAdmittedPatient("Third floor"));
		return "nurse_module/thirdFloor";
	}
	@RequestMapping("fourthFloor")
	public String fourthFloor(Model model) {
		model.addAttribute("heading", "Admitted Patient");
		model.addAttribute("object", nrs.getAdmittedPatient("Fourth floor"));
		return "nurse_module/fourthFloor";
	}
	@RequestMapping("fifthFloor")
	public String fifthFloor(Model model) {
		model.addAttribute("heading", "Admitted Patient");
		model.addAttribute("object", nrs.getAdmittedPatient("Fifth floor"));
		return "nurse_module/fifthFloor";
	}
	@RequestMapping("sixthFloor")
	public String sixthFloor(Model model) {
		model.addAttribute("heading", "Admitted Patient");
		model.addAttribute("object", nrs.getAdmittedPatient("Sixth Floor"));
		return "nurse_module/sixthFloor";
	}
	
	@RequestMapping("thirdFloorTodayDischarge")
	public String thirdFloorTodayDischarge(Model model) {
		model.addAttribute("heading", "Today Discharge Patient");
		model.addAttribute("object", nrs.getTodayDischrrgePatient("Third floor"));
		return "nurse_module/thirdFloor";
	}
	@RequestMapping("fourthFloorTodayDischarge")
	public String fourthFloorTodayDischarge(Model model) {
		model.addAttribute("heading", "Today Discharge Patient");
		model.addAttribute("object", nrs.getTodayDischrrgePatient("Fourth floor"));
		return "nurse_module/fourthFloor";
	}
	@RequestMapping("fifthFloorTodayDischarge")
	public String fifthFloorTodayDischarge(Model model) {
		model.addAttribute("heading", "Today Discharge Patient");
		model.addAttribute("object", nrs.getTodayDischrrgePatient("Fifth floor"));
		return "nurse_module/fifthFloor";
	}
	@RequestMapping("sixthFloorTodayDischarge")
	public String sixthFloorTodayDischarge(Model model) {
		model.addAttribute("heading", "Today Discharge Patient");
		model.addAttribute("object", nrs.getTodayDischrrgePatient("Sixth Floor"));
		return "nurse_module/sixthFloor";
	}
}
