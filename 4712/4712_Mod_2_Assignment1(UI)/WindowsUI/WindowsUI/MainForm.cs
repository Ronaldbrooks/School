using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsUI
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string text = null;

            //useless code
            //TranslatorService.LanguageServiceClient client = new TranslatorService.LanguageServiceClient();
            //text = client.Translate("app id", textBox1.Text, "en", "de");
            //text = client.Translate("app ID", textBox1.Text, "en", "fr");
            //text = client.Translate("app ID", textBox1.Text, "en", "es");
            //textBox2.Text = text;

            text = comboBox1.SelectedItem.ToString();

            //Spanish
            if (text == "Spanish")
            {
                textBox2.Text = "Hola como estas";
            }
            //French
            else if (text == "French")
            {
                textBox2.Text = "salut comment allez-vous";
            }
            //Japanese
            else if (text == "Japanese")
            {
                textBox2.Text = "こんにちは、元気ですか";
            }
            //German
            else //(str == "German");
            {
                textBox2.Text = "Hallo wie geht's dir";
            }
        }
    }
}
//app id - 6CE9C85A41571C050C379F60DA173D286384E0F2
//not working