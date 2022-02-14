<template>
  <div>
    <b-navbar toggleable="lg" type="dark" variant="primary" class="navbar-horizontal">
      <b-navbar-brand href="#">PRIMARY COLOR</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-form>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <span class="nav-link nav-link-inner--text">Discover</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <span class="nav-link nav-link-inner--text">Profile</span>
              </a>
            </li>
            <b-nav-item-dropdown right>
              <template v-slot:button-content>
                <span class="nav-link-inner--text">Settings</span>
              </template>
              <b-dropdown-item href="#">Action</b-dropdown-item>
              <b-dropdown-item href="#">Another action</b-dropdown-item>
              <b-dropdown-divider></b-dropdown-divider>
              <b-dropdown-item href="#">Something else here</b-dropdown-item>
            </b-nav-item-dropdown>
          </b-nav-form>

        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
    <br><br>
    <b-navbar toggleable="lg" type="dark" variant="success" class="navbar-horizontal">
      <b-navbar-brand href="#">SUCCESS COLOR</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-form>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="nav-link ni ni-favourite-28"></i>
                <span class="nav-link-inner--text d-lg-none">Discover</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="nav-link ni ni-planet"></i>
                <span class="nav-link-inner--text d-lg-none">Profile</span>
              </a>
            </li>
            <b-nav-item-dropdown right>
              <template v-slot:button-content>
                <i class="ni ni-settings-gear-65"></i>
                <span class="nav-link-inner--text d-lg-none">Settings</span>
              </template>
              <b-dropdown-item href="#">Action</b-dropdown-item>
              <b-dropdown-item href="#">Another action</b-dropdown-item>
              <b-dropdown-divider></b-dropdown-divider>
              <b-dropdown-item href="#">Something else here</b-dropdown-item>
            </b-nav-item-dropdown>
          </b-nav-form>

        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
    <br><br>
    <b-navbar toggleable="lg" type="dark" variant="danger" class="navbar-horizontal">
      <b-navbar-brand href="#">DANGER COLOR</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-form>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="fab fa-facebook-square"></i>
                <span class="nav-link-inner--text d-lg-none">Facebook</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="fab fa-twitter"></i>
                <span class="nav-link-inner--text d-lg-none">Twitter</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="fab fa-google-plus"></i>
                <span class="nav-link-inner--text d-lg-none">Google +</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="fab fa-instagram"></i>
                <span class="nav-link-inner--text d-lg-none">Instagram</span>
              </a>
            </li>
          </b-nav-form>

        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
    <br><br>
    <b-navbar toggleable="lg" type="dark" variant="warning" class="navbar-horizontal">
      <b-navbar-brand href="#">WARNING COLOR</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-form>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="fab fa-facebook-square"></i>
                <span class="nav-link-inner--text d-lg-none">Facebook</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="fab fa-twitter"></i>
                <span class="nav-link-inner--text d-lg-none">Twitter</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="fab fa-pinterest"></i>
                <span class="nav-link-inner--text d-lg-none">Pinterest</span>
              </a>
            </li>
          </b-nav-form>

        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
    <br><br>
    <b-navbar toggleable="lg" type="dark" variant="info" class="navbar-horizontal">
      <b-navbar-brand href="#">INFO COLOR</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-form>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="fab fa-facebook-square"></i>
                <span class="nav-link-inner--text">Facebook</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="fab fa-twitter"></i>
                <span class="nav-link-inner--text">Twitter</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-link-icon" href="#">
                <i class="fab fa-instagram"></i>
                <span class="nav-link-inner--text">Instagram</span>
              </a>
            </li>
          </b-nav-form>

        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
  </div>

  <side-bar>
    <template slot="links">
      <sidebar-item
          :link="{
        name: 'Dashboard',
        icon: 'ni ni-shop text-primary',
        path: '/dashboard'
      }">
      </sidebar-item>

      <sidebar-item
          :link="{
        name: 'Icons',
        icon: 'ni ni-planet text-orange',
        path: '/icons'
      }">
      </sidebar-item>
    </template>
  </side-bar>
</template>

<script>
export default {
  name: "default"
}
</script>

<style scoped>

</style>