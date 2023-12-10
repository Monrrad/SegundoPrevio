package co.Empresa.BancoBBVA.Modelo;



import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
	public class Bill {

		private Integer id;
		private Date date_bill;
		private Integer user_Id;
		private Integer value;
		private Integer type;
		private String observation;
		
		public Bill(int id, Date date_bill, String observation, int type, int value) {
			this.id = id;
			this.date_bill = date_bill;
			this.observation = observation;
			this.type = type;
			this.value = value;	
		}

		public Bill(Date date_bill, int user_id, int value, int type, String observation) {
			this.date_bill = date_bill;
			this.user_Id = user_id;
			this.value = value;
			this.type = type;
			this.observation = observation;
			
		}
	}
