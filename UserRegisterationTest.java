import org.junit.Assert;
import org.junit.Test;

public class UserRegisterationTest {
    UserRegisteration validator = new UserRegisteration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isValidFirstName("Hima");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isValidFirstName("hima");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isValidLastName("Yadav");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isValidLastName("yADav");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isValidEmail("yadavhimanshu63@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isValidEmail("99@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isValidPhoneNumber("91 1234567890");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isValidEmail("19123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMinimumEightCharacterPassword_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isValidPassword("himan1234");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMinimumEightCharacterPassword_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isValidPassword("hm123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenOneUpperCasePassword_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isOneUpperCaseValidPassword("Himanshu");
        Assert.assertTrue(result);
    }

    @Test
    public void givenOneUpperCasePassword_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isOneUpperCaseValidPassword("himanshu");
        Assert.assertFalse(result);
    }

    @Test
    public void givenOneNumericPassword_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isOneNumericValidPassword("Himanshu99");
        Assert.assertTrue(result);
    }

    @Test
    public void givenOneNumericPassword_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isOneNumericValidPassword("Himanshu");
        Assert.assertFalse(result);
    }

    @Test
    public void givenExactlyOneSpecialCharacterPassword_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isSpecialValidPassword("Himanshu99@");
        Assert.assertTrue(result);
    }

    @Test
    public void givenExactlyOneSpecialCharacterPassword_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isSpecialValidPassword("Himanshu99@@");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailPassword_WhenProper_ShouldReturnTrue() {
        String[] validEmailArray = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com"};
        for (int index = 0; index < validEmailArray.length; index++) {
            boolean result = validator.isValidEmail(validEmailArray[index]);
            Assert.assertTrue(result);
        }
    }

    @Test
    public void givenEmailPassword_WhenProper_ShouldReturnFalse() {
        String[] invalidEmailArray = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com ", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        for (int index = 0; index < invalidEmailArray.length; index++) {
            boolean result = validator.isValidEmail(invalidEmailArray[index]);
            Assert.assertFalse(result);
        }
    }
}
