package myPackage.boot.pojo;/*
 *ClassName:User
 *Package:myPackage.boot.pojo
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/25-13:22
 *Version:v1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    String username;
    String password;
}
