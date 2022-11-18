package com.example.sql;

public class CreateTable {

	public static void main(String[] args) {

		// Create a table
		String sql = "CREATE TABLE IF NOT EXISTS `employee` (\n" +
				"  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
				"  `name` varchar(255) NOT NULL,\n" +
				"  `age` int(11) NOT NULL,\n" +
				"  `salary` int(11) NOT NULL,\n" +
				"  PRIMARY KEY (`id`)\n" +
				") \n";

		// Insert a row
		String sql2 = "INSERT INTO `employee` (`name`, `age`, `salary`) \n" +
				"VALUES ('John', 20, 1000)";

		// Update a row
		String sql3 = "UPDATE `employee` SET `name` = 'John Doe' WHERE `id` = 1";

		// Delete a row
		String sql4 = "DELETE FROM `employee` WHERE `id` = 1";

		// Select join
		String sql5 = "SELECT * FROM `employee` e JOIN `department` d ON e.department_id = d.id";

		System.out.println(sql + "\n" + sql2 + "\n" + sql3 + "\n" + sql4 + "\n" + sql5);
	}
}
