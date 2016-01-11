    /**
     * Created by cladlink on 11/01/16.
     */
    public class ControlGroup
    {

        private Model model;
        private Vue vue;
        private ControlMouse controlMouse;


        public ControlGroup(Model model)
        {
            this.model = model;
            vue = new Vue(model);
            controlMouse = new ControlMouse(model, vue);
        }
    }
