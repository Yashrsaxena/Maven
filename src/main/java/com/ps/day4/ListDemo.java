package com.ps.day4;
 
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		List<Participant> participants = new ArrayList<>();
		try (Scanner input = new Scanner(System.in)) {
			String name, interests;
			Integer id, s = 0;
			while(s!=5) {
				System.out.println("Please enter the option number according to the action required");
				System.out.println("1. Enter new Paticipant details:");
				System.out.println("2. Display all");
				System.out.println("3. Sort");
				System.out.println("5. Exit");
				s = input.nextInt();
				if(s==1) {
			System.out.print("Enter name");
			name = input.nextLine();
			System.out.println("Enter id");
			id = input.nextInt();
			System.out.print("Enter interests");
			interests = input.nextLine();
			
			String firstName, lastName,  n[] = name.split(" ");
			firstName = n[0];
			lastName = n[1];
			
			participants.add(new Participant(firstName, lastName, id, interests));
				}
				else if(s==2) {
				System.out.println(participants);
				}
				else if(s==3) {
					Integer o;
					System.out.println("Sort By: 1. First Name, 2. Last Name, 3. Id, 4. Interests");
					o = input.nextInt();
					if(o==1) {
						Collections.sort(participants, new SortParticipantsByFirstName());
					}
					else if(o==2) {
						Collections.sort(participants, new SortParticipantsByLastName());
					}
					else if(o==3) {
						Collections.sort(participants, new SortParticipantsById());
					}
					else if(o==4) {
						Collections.sort(participants, new SortParticipantsByInterests());
					}
					else {
						System.out.println("Wrong Choice!");
					}
				}
			}
		}
		
//		participants.add(new Participant("Pranav", 34, "Playing Cricket"));
//		participants.add(new Participant("Shubham", 42, "Reading books"));
//		participants.add(new Participant("Anita", 551, "Trekking, Reading books"));
//		
//		System.out.println(participants);
//		
//		for (Participant theParticipant : participants) {
//			System.out.println(theParticipant.getName()+" likes to "+ theParticipant.getInterests());
//			System.out.println(theParticipant);
//		}
//		
//		Collections.sort(participants, new SortParticipantsByName());
//		
//		System.out.println("After Sorting : ");
//		
//		for (Participant theParticipant : participants) {
//			System.out.println(theParticipant.getName()+" likes to "+ theParticipant.getInterests());
//			System.out.println(theParticipant);
		}
	}

//Sort by name

class SortParticipantsByFirstName implements Comparator<Participant>{
	@Override
	public int compare(Participant o1, Participant o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}

class SortParticipantsByLastName implements Comparator<Participant>{
	@Override
	public int compare(Participant o1, Participant o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}
}
class SortParticipantsById implements Comparator<Participant>{
	@Override
	public int compare(Participant o1, Participant o2) {
		return o1.getId().compareTo(o2.getId());
	}
}

class SortParticipantsByInterests implements Comparator<Participant>{
	@Override
	public int compare(Participant o1, Participant o2) {
		return o1.getInterests().compareTo(o2.getInterests());
	}
}